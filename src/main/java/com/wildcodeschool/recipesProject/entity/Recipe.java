package com.wildcodeschool.recipesProject.entity;

import jakarta.persistence.*;

@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long quantity;
    private String flavor;

    public Recipe() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long capacity) {
        this.quantity = capacity;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String country) {
        this.flavor = country;
    }
}