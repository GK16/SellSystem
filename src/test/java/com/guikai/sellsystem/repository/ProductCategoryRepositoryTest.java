package com.guikai.sellsystem.repository;

import com.guikai.sellsystem.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    //避免懒加载导致的session不存在问题
    @Transactional(readOnly = true)
    public void findOneTest() {
        System.out.println("findOneTest");
        ProductCategory productCategory = repository.getById(1);
        System.out.println(productCategory.toString());
    }

    @Test
    @Transactional
    public void saveTest() {
        ProductCategory productCategory = new ProductCategory("综合最爱",5);
        ProductCategory res =  repository.save(productCategory);
        Assert.assertNotNull(res);
    }

    @Test
    public void findByCategoryTypeIn(){
        List<Integer> list = Arrays.asList(3,4,5);
        List<ProductCategory> res = repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0, res.size());
    }



}