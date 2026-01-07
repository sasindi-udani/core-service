package edu.icet.com.controller;

import edu.icet.com.model.Product;
import edu.icet.com.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController
public class ProductController {

    @GetMapping("/get-products")
    public ArrayList<Product> getProducts(){
        ProductService service = new ProductService();
        ArrayList<Product> products =  service.getProducts();
        System.out.println(products);
        return products;
    }
}
