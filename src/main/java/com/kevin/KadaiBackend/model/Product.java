package com.kevin.KadaiBackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String productName;
    private String productDescription;
    private String productViews;
    private String productPrice;
    private boolean productAvailable;
    private String productCategory;
    private int stockQuantity;
    private String imageName;
    private String imageType;
    @Lob
    private byte[] imageData;

}
