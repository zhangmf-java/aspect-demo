package com.apooboo.aspectdemo.service;

import com.apooboo.aspectdemo.annotation.AdminOnly;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class ProductService {


    @AdminOnly
    public void findById(Long id){
        System.out.println("execute find by id");
    }
}
