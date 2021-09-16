package com.productmvc.service;

import java.util.List;

import com.productmvc.beans.Product;

public interface ProductService {
    
    public int insertIntoDb(Product p);

    public Product getProd(Integer id);

    public List<Product> getAllProd();

    public int updateProduct(Product p);

    public void deleteProduct(int id);

}