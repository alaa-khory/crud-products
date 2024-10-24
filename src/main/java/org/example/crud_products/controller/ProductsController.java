package org.example.crud_products.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductsController {

    @GetMapping
    public String getString(){
        String s = "Test npoint";
        String s1 = "s1";
        return s + s1;
    }


}
