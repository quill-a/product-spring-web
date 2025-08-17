package dev.quilla.productspringweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductService {

    @Autowired
    ProductDB db;

    public void addProduct(Product p) {

        db.save(p);
    }

    public List<Product> getAllProducts() {
        return db.findAll();
    }

    public Product getProduct(String name) {
        return db.findByName(name);
    }

//    public List<Product> getProductWithText(String text) {
//
//        String str = text.toLowerCase();
//        List<Product> products = new ArrayList<>();
//
//        for(Product p : products) {
//
//            String name = p.getName().toLowerCase();
//            String type = p.getType().toLowerCase();
//            String place = p.getPlace().toLowerCase();
//
//            if(name.contains(str) || type.contains(str) || place.contains(str)) products.add(p);
//        }
//
//        return products;
//    }
}
