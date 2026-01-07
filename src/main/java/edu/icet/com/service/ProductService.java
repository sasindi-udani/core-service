package edu.icet.com.service;

import edu.icet.com.model.Product;

import java.util.ArrayList;

public class ProductService {

    public ArrayList<Product> getProducts(){
        Product appleProduct = new Product();
        appleProduct.setName("Apple");
        appleProduct.setPrice(100.0);
        appleProduct.setDescription("A tasty apple");

        Product orangeProduct = new Product("Orange",200.0,"A juicy orange");

        ArrayList<Product> productList = new ArrayList();
        productList.add(appleProduct);
        productList.add(orangeProduct);
        return productList;
    }
}
