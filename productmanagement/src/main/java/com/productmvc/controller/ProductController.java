package com.productmvc.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.productmvc.beans.Product;
import com.productmvc.service.ProductService;

@RestController
@RequestMapping("/prod")
public class ProductController {
    
    @Autowired
    private ProductService ps;
    
    
    
    @GetMapping("/show")
    public String showMsg() {
        System.out.println("request reached");
        return "hello boot";
    }
    
    
    
    @GetMapping("/getprod/{id}")
    public Product getProduct(@PathVariable Integer id) {
        System.out.println("id got "+id);
        Product p= ps.getProd(id);

        
        return p;
    }
    
    
    
    @PostMapping("/insertprod")
    public int insertProduct(@RequestBody Product p) {
        
        System.out.println(p);
        int id=ps.insertIntoDb(p);
        
        return id;
        
        
    }

    @GetMapping("/getall")
    public List<Product> getAllProducts() {
    
        List<Product> prodlist= ps.getAllProd();
        return prodlist;
        
    }
    
    @PutMapping("/updateprod")
    public int updateProduct(@RequestBody Product p) {
        
        int id=ps.updateProduct(p);
        
        return id;
    }
    
    
    @DeleteMapping("/deleteprod/{id}")
    public void deleteproduct(@PathVariable Integer id) {
        ps.deleteProduct(id);
        System.out.println("product deleted");
    }
}