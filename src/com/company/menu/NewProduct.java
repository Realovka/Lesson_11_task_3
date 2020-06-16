package com.company.menu;

import com.company.Product;
import com.company.Shop;

import java.time.LocalDateTime;
import java.util.Scanner;

public class NewProduct {
    public static void addNewProduct(Shop shop) {
        int newId = 0;
        int newPrice = 0;
        int editingYear = 0;
        int editingMonth = 0;
        int editingDay = 0;
        int editingHour = 0;
        int editingMinute = 0;
        int editingSecond = 0;
        System.out.println("Введите id товара");
        Scanner scanner = new Scanner(System.in);
        newId = scanner.nextInt();
        System.out.println("Введите наименование товара");
        Scanner scanner1 = new Scanner(System.in);
        String newProduct = scanner1.nextLine();
        System.out.println("Введите цену товара");
        Scanner scanner2 = new Scanner(System.in);
        newPrice = scanner2.nextInt();
        System.out.println("Введите год, в котором добавляете товар");
        Scanner scanner3 = new Scanner(System.in);
        editingYear = scanner3.nextInt();
        System.out.println("Введите месяц, в котором добавляете товар");
        Scanner scanner4 = new Scanner(System.in);
        editingMonth = scanner4.nextInt();
        System.out.println("Введите день, в котором добавляете товар");
        Scanner scanner5 = new Scanner(System.in);
        editingDay = scanner5.nextInt();
        System.out.println("Введите час, в котором добавляете товар");
        Scanner scanner6 = new Scanner(System.in);
        editingHour = scanner6.nextInt();
        System.out.println("Введите минуту, в котором добавляете товар");
        Scanner scanner7 = new Scanner(System.in);
        editingMinute = scanner7.nextInt();
        System.out.println("Введите секунду, в котором добавляете товар");
        Scanner scanner8 = new Scanner(System.in);
        editingSecond = scanner8.nextInt();
        Product product = new Product(newId, newProduct, newPrice, LocalDateTime.of(editingYear, editingMonth, editingDay, editingHour, editingMinute, editingSecond));
        shop.addProduct(product);
        shop.getAll();

    }
}
