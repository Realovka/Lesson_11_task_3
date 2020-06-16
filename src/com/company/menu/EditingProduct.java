package com.company.menu;

import com.company.Product;
import com.company.Shop;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class EditingProduct {
    public static void editProduct(List<Product> products, Shop shop) {
        int editingId = 0;
        int editingPrice = 0;
        try {
            System.out.println("Введите id товара, который хотите отредактировать");
            Scanner scanner=new Scanner(System.in);
            editingId = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Нужно ввести цифру");
        }
        System.out.println("Введите новое название");
        Scanner scanner1=new Scanner(System.in);
        String editingProduct = scanner1.nextLine();
        try {
            System.out.println("Введите новую цену");
            Scanner scanner2=new Scanner(System.in);
            editingPrice = scanner2.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Нужно ввести цифру");
        }

    ;
        boolean result = false;
        for (Product item : products) {
            if (item.getId() == editingId) {
                Product productEditing= new Product(editingId, editingProduct, editingPrice, item.getLocalDateTime());
                shop.replaceProduct(productEditing);
                result = true;
            }
        }
        if (result) {
            shop.getAll();
        } else {
            System.out.println("В магазине нет товара с таким id");
        }
    }
}
