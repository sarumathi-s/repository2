package com.productmvc.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Product {
@Id
private int prodId;
@Column
private String prodName;
@Column
private int quantity;


public Product() {
super();
}
public Product(int prodId, String prodName, int quantity) {
super();
this.prodId = prodId;
this.prodName = prodName;
this.quantity = quantity;
}
public int getProdId() {
return prodId;
}
public void setProdId(int prodId) {
this.prodId = prodId;
}
public String getProdName() {
return prodName;
}
public void setProdName(String prodName) {
this.prodName = prodName;
}
public int getQuantity() {
return quantity;
}
public void setQuantity(int quantity) {
this.quantity = quantity;
}
@Override
public String toString() {
return "Product [prodId=" + prodId + ", prodName=" + prodName + ", quantity=" + quantity + "]";
}
}