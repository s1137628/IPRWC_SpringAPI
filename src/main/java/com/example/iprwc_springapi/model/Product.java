package com.example.iprwc_springapi.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.util.UUID;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID productId;

    @NotBlank(message = "Product name cannot be null or empty")
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "Invalid product name. Only letters and spaces are allowed.")
    private String name;

    @NotBlank(message = "Product description cannot be null or empty")
    @Pattern(regexp = "^[a-zA-Z0-9\\s]+$", message = "Invalid product description. Only letters, numbers, and spaces are allowed.")
    private String description;

    @NotNull(message = "Product price cannot be null")
    @DecimalMin(value = "0.0", inclusive = false, message = "Invalid product price. Price must be non-negative.")
    private double price;
    @NotBlank(message = "Product image path cannot be null or empty")
    private String imagePath;


    public UUID getProductId() {
        return productId;
    }

    public void setProductId(UUID productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

}
