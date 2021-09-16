package com.productmvc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productmvc.beans.Product;
import com.productmvc.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

@Autowired
    private ProductRepository pr;

@Override
public int insertIntoDb(Product p) {

Product p1=pr.save(p);


return p1.getProdId();
}

@Override
public Product getProd(Integer id) {
Optional<Product> opt=pr.findById(id);
if(opt.isPresent()) {
return opt.get();
}else {
return null;
}
}

@Override
public List<Product> getAllProd() {
List<Product> list=pr.findAll();


return list;
}

@Override
public int updateProduct(Product p) {

Product p1=pr.save(p);
return p1.getProdId();
}

@Override
public void deleteProduct(int id) {
   pr.deleteById(id);

}

}