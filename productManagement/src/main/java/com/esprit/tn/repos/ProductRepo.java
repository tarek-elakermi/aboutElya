package com.esprit.tn.repos;


import com.esprit.tn.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {


    Product findByNameP(String nameP);

}
