package com.guikai.sellsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.guikai.sellsystem.dataobject.ProductCategory;

import java.util.List;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
