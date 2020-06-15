package com.company.menu;

import com.company.Shop;

import java.util.Scanner;

public class RemoveProduct {
    public static void removeProduct(Shop shop) {
        System.out.println("Введите id товара, который хотите удалить");
        Scanner scanner1 = new Scanner(System.in);
        int idRemove = scanner1.nextInt();
        boolean result = shop.removeById(idRemove);
        if (result) {
            System.out.println("Товар под id " + idRemove + " удален");
            shop.getAll();
        } else {
            System.out.println("Товара с таким id в магазине нет");
        }
    }
}
