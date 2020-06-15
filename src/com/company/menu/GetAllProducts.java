package com.company.menu;

import com.company.Product;
import com.company.Shop;
import com.company.sort.SortByAdd;
import com.company.sort.SortByPriceAscending;
import com.company.sort.SortByPriceDecrease;

import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class GetAllProducts {
    public static void showMenu(List<Product> products, Shop shop) {
        boolean flag = true;
        while (flag) {
            String[] menuTwo = {"Выберите вид сортировки товара:", "1.По цене(по возрастанию)", "2.По цене(по убыванию)", "3.По добавлению (сначала новый, потом старый)"};
            for (String item : menuTwo) {
                System.out.println(item);
            }
            try {
                Scanner scanner2 = new Scanner(System.in);
                int showProducts = scanner2.nextInt();
                if (showProducts == 1) {
                    Collections.sort(products, new SortByPriceAscending());
                    shop.getAll();
                    flag = false;
                } else if (showProducts == 2) {
                    Collections.sort(products, new SortByPriceDecrease());
                    shop.getAll();
                    flag = false;
                } else if (showProducts == 3) {
                    Collections.sort(products, new SortByAdd());
                    shop.getAll();
                    flag = false;
                } else {
                    System.out.println("Такого варианта в меню нет. Возможно только 1-3.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Нужно ввести цифру");
            }

        }
    }
}

