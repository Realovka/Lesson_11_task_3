package com.company.sort;
import com.company.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortByAdd implements Comparator <Product>{
    @Override
    public int compare(Product o1, Product o2) {
        List<Product> product = new ArrayList<>();
        product.add(o1);
        product.add(o2);
        if(product.indexOf(o1)<product.indexOf(o2)){
            return -1;
        } else return 1;
    }
}
