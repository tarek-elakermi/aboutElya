package com.esprit.tn.services;

import com.esprit.tn.models.Product;

public interface ProductService {
    Product saveProduct(Product p);

    Product getProductByName(String a);
}
