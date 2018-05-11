package com.qqlei.cloud.product.service;

import com.qqlei.cloud.product.dao.ProductMapper;
import com.qqlei.cloud.product.domain.Product;
import com.reliable.message.client.annotation.MqProducerStore;
import com.reliable.message.client.model.domain.MqMessageData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


/**
 *  ProductServiceImpl
 */
@Slf4j
@Service("productService")
public class ProductService {

    @Autowired
    private ProductMapper productMapper;


    @MqProducerStore
    @Transactional
    public int saveProduct(MqMessageData mqMessageData,Product product){
        log.info("新增商品. mqMessageData={}, product={}", mqMessageData, product);
        return insert(product);
    }


    public int insert(Product product) {
        return  productMapper.insert(product);
    }
}
