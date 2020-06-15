package com.company;


import com.company.menu.AddNewProduct;
import com.company.menu.EditingProduct;
import com.company.menu.GetAllProducts;
import com.company.menu.RemoveProduct;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class Aplication {
    public void start(List<Product> products, Shop shop) {
        while (true) {
            System.out.println();
            String[] menu = {"Выберите действие:", "1.Вывод всех товаров", "2.Добавление товара", "3.Удаление товара", "4.Редактирование товара", "5.Выход"};
            for (String item : menu) {
                System.out.println(item);
            }
            try {
                Scanner scanner = new Scanner(System.in);
                int number = scanner.nextInt();
                if (number == 1) {
                    GetAllProducts.showMenu(products, shop);
                } else if (number == 2) {
                    AddNewProduct.addNewProduct(shop);
                } else if (number == 3) {
                    RemoveProduct.removeProduct(shop);
                } else if (number == 4) {
                    EditingProduct.editingProduct(products, shop);
                } else if (number == 5) {
                    break;
                } else {
                    System.out.println("Такого действия в меню нет");
                }
            } catch (InputMismatchException e) {
                System.out.println("Нужно ввести цифру");
            }
        }
    }
}
