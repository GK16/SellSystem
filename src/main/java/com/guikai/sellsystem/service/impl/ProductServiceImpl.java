package com.guikai.sellsystem.service.impl;

import com.guikai.sellsystem.dataobject.ProductInfo;
import com.guikai.sellsystem.enums.ProductStatusEnums;
import com.guikai.sellsystem.repository.ProductInfoRespository;
import com.guikai.sellsystem.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRespository respository;

    @Override
    public ProductInfo findOne(String productId) {
        return respository.getById(productId);
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return respository.findByProductStatus(ProductStatusEnums.UP.getCode());
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return respository.findAll(pageable);
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return respository.save(productInfo);
    }
}
