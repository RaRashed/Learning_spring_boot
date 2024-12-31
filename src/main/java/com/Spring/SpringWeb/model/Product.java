package com.Spring.SpringWeb.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
public class Product {
    private int prodId;
    private String prodName;
    private int price;

    // Default constructor for Spring
    public Product() {
    }

    // Parameterized constructor
    public Product(int prodId, String prodName, int price) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.price = price;
    }

    // Lombok @Data generates these methods automatically, so you can remove them if Lombok is working
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

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Product{" +
                "prodId=" + prodId +
                ", prodName='" + prodName + '\'' +
                ", price=" + price +
                '}';
    }
}
