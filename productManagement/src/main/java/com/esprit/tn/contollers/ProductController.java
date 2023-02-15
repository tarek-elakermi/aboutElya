package com.esprit.tn.contollers;


import com.esprit.tn.models.Product;
import com.esprit.tn.services.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    public ProductServiceImpl productService;


    @PostMapping("/saveProduct")
    public Product saveP(Product p){
        return productService.saveProduct(p);
    }

    @GetMapping("/getProduct/{name}")
    public Product getP(@PathVariable("name") String name){
        return productService.getProductByName(name);
    }
}
