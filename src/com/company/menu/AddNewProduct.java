package com.company.menu;

import com.company.Product;
import com.company.Shop;

import java.util.Scanner;

public class AddNewProduct {
    public static void addNewProduct(Shop shop){
        System.out.println("Введите id товара");
        Scanner scanner1 = new Scanner(System.in);
        int newId=scanner1.nextInt();
        System.out.println("Введите наименование товара");
        Scanner scanner2 = new Scanner(System.in);
        String newProduct=scanner2.nextLine();
        System.out.println("Введите цену товара");
        Scanner scanner3 = new Scanner(System.in);
        int newPrice=scanner3.nextInt();
        Product product=new Product(newId,newProduct,newPrice);
        shop.addProduct(product);
        shop.getAll();

    }
}
