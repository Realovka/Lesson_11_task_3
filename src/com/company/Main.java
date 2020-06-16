package com.company;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Product> products = new LinkedList<>();
        Shop shop = new Shop(products);
        Product product1 = new Product(1, "пылесос", 400,LocalDateTime.of(2020, Month.JUNE,16, 15, 16,20));
        Product product3 = new Product(6, "холодильник", 2000,LocalDateTime.of(2020, Month.JUNE,16, 15, 16,35));
        Product product4 = new Product(3, "микроволновка", 20,LocalDateTime.of(2020, Month.JUNE,16, 15, 16,40));
        Product product5 = new Product(21, "кофеварка", 100,LocalDateTime.of(2020, Month.JUNE,16, 15, 16,45));
        Product product6 = new Product(8, "миксер", 80,LocalDateTime.of(2020, Month.JUNE,16, 15, 16,50));

        shop.addProduct(product1);
        shop.addProduct(product3);
        shop.addProduct(product4);
        shop.addProduct(product5);
        shop.addProduct(product6);


        Aplication aplication = new Aplication();
        aplication.start(products, shop);

    }


}
