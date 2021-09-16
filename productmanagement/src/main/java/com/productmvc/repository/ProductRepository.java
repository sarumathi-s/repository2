

package com.productmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.productmvc.beans.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}