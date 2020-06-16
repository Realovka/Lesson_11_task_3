package com.company;

import com.company.menu.AllProducts;
import com.company.menu.EditingProduct;
import com.company.menu.NewProduct;
import com.company.menu.RemoveProduct;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class Aplication {
    public void start(List<Product> products, Shop shop) {
        while (true) {
            System.out.println();
            int number = 0;
            String[] menu = {"Выберите действие:", "1.Вывод всех товаров", "2.Добавление товара", "3.Удаление товара", "4.Редактирование товара", "5.Выход"};
            for (String item : menu) {
                System.out.println(item);
            }
            try {
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Нужно ввести цифру");
            }
            if (number == 1) {
                AllProducts.getProducts(products, shop);
            } else if (number == 2) {
                NewProduct.addNewProduct(shop);
            } else if (number == 3) {
                RemoveProduct.removeProduct(shop);
            } else if (number == 4) {
                EditingProduct.editProduct(products, shop);
            } else if (number == 5) {
                break;
            } else {
                System.out.println("Такого действия в меню нет");
            }

        }
    }
}

