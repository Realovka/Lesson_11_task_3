package com.company;

import java.util.List;

public class Shop {
    private List<Product> products;

    public Shop(List<Product> products) {
        this.products = products;
    }


    public void addProduct(Product product) {           //метод, добавляющий товар в магазин
        boolean flag = true;
        for (int i = 0; i < products.size(); i++) {
            if (product.getId() == products.get(i).getId()) {
                flag = false;
                System.out.println("Товар с таким id уже есть");
            }
        }


        if (flag) {
            products.add(product);
        }

    }

    public void getAll() {                                                      //метод, выводящий все товары в магазине
        for (int i = 0; i < products.size(); i++) {
            System.out.print(products.get(i).getId() + " ");
            System.out.print(products.get(i).getName() + " ");
            System.out.println(products.get(i).getPrice() + " ");

        }
    }

    public boolean removeById(int id) {                                            //метод, удаляющий товар по id
        boolean flag = false;
        for (int i = 0; i < products.size(); i++) {
            if (id == products.get(i).getId()) {
                products.remove(products.get(i));
                flag = true;
            }
        }
        return flag;
    }


    public void replaceProduct(Product product) {         //метод, редактирующий товар
        for (int i = 0; i < products.size(); i++) {
            if (product.getId()==(products.get(i).getId())) {
                products.set(i, product);
            }
        }

    }

}

