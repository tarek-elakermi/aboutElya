package com.esprit.tn.services;

import com.esprit.tn.models.Product;
import com.esprit.tn.repos.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    public ProductRepo productRepo;





    @Override
    public Product saveProduct(Product p) {
        return productRepo.save(p);
    }

    @Override
    public Product getProductByName(String a) {
        return productRepo.findByNameP(a);
    }
}
