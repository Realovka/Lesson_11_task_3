package com.company.sort;
import com.company.Product;

import java.util.Comparator;


public class SortByDateTime implements Comparator <Product>{
    @Override
    public int compare(Product o1, Product o2) {

        if(o1.getLocalDateTime().isBefore(o2.getLocalDateTime())){
            return 1;
        } else return -1;
    }
}
