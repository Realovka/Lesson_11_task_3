package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        Shop shop = new Shop(products);
        Product product1 = new Product(1, "пылесос", 400);
        Product product2 = new Product(2, "фен", 200);
        Product product3 = new Product(2, "холодильник", 2000);
        Product product4 = new Product(3, "микроволновка", 20);
        Product product5 = new Product(21, "кофеварка", 100);
        Product product6 = new Product(8, "миксер", 80);
        Product product7 = new Product(2, "фен", 350);
        shop.addProduct(product1);
        shop.addProduct(product2);
        shop.addProduct(product3);
        shop.addProduct(product4);
        shop.addProduct(product5);
        shop.addProduct(product6);


        Aplication aplication = new Aplication();
        aplication.start(products, shop);
    }
}
