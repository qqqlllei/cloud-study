package com.qqlei.cloud.product.dao;

import com.qqlei.cloud.product.domain.Product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
/**
 *  ProductMapper
 */
//@Mapper
//@Component("productMapper")
public interface ProductMapper {

    int insert(Product product);
}
