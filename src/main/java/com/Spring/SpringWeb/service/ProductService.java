package com.Spring.SpringWeb.service;

import com.Spring.SpringWeb.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    List<Product> products =new ArrayList<>(Arrays.asList(
            new Product(101,"Iphone",5000),
            new Product(102,"Pixel",7000)));


    public List<Product> getProducts(){
        return products;
    }
    public Product getProductById(int prodId){
        return products.stream()
                .filter(p -> p.getProdId() == prodId)
                .findFirst().get();
    }
    public void addProduct(Product prod){
        products.add(prod);
    }
}
