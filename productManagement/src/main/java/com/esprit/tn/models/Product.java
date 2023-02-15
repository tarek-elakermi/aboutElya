package com.esprit.tn.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nameP;


    public Product() {
    }

    public Product(Long id, String nameP) {
        this.id = id;
        this.nameP = nameP;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameP() {
        return nameP;
    }

    public void setNameP(String nameP) {
        this.nameP = nameP;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nameP='" + nameP + '\'' +
                '}';
    }
}
