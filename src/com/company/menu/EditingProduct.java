package com.company.menu;

import com.company.Product;
import com.company.Shop;

import java.util.List;
import java.util.Scanner;

public class EditingProduct {
    public static void editingProduct(List<Product> products, Shop shop) {
        System.out.println("Введите id товара, который хотите отредактировать");
        Scanner scanner1 = new Scanner(System.in);
        int editingId = scanner1.nextInt();
        System.out.println("Введите новое название");
        Scanner scanner2 = new Scanner(System.in);
        String editingProduct = scanner2.nextLine();
        System.out.println("Введите новую цену");
        Scanner scanner3 = new Scanner(System.in);
        int editingPrice = scanner3.nextInt();
        Product productEditing = new Product(editingId, editingProduct, editingPrice);
        boolean result = false;
        for (Product item : products) {
            if (item.getId() == editingId) {
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
