package com.apooboo.aspectdemo.service;

import com.apooboo.aspectdemo.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    AuthService authService;


    public void insert(Product product){
        System.out.println("insert product");
    }

    public void delete(Long id){
        System.out.println("delete product"+id);
    }
}
