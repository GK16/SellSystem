package com.guikai.sellsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.guikai.sellsystem.dataobject.ProductCategory;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {
}
