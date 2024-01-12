package com.example.iprwc_springapi.dao;


import com.example.iprwc_springapi.exception.NotFoundException;
import com.example.iprwc_springapi.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

@Component
public class ProductDAO {

    @Autowired
    private ProductRepository productRepository;

    public ArrayList<Product> all(){
        ArrayList<Product> allProducts = (ArrayList<Product>) this.productRepository.findAll();
        return allProducts;
    }

    public Product getById(UUID id){
        Optional<Product> optionalProduct = this.productRepository.findById(id);
        if(optionalProduct.isEmpty()){
            throw new NotFoundException("Product with id: " + id + "not found");
        }
        return optionalProduct.get();
    }

    public Product save(Product newProduct){
        Product product = this.productRepository.save(newProduct);
        return product;
    }

    public Product replace(Product newProduct, UUID id) throws NotFoundException{
        Optional<Product> optionalProduct = this.productRepository.findById(id);

        if(optionalProduct.isEmpty()){
            throw new NotFoundException("Product with id: " + id + " not found");
        }

        Product currentProduct = optionalProduct.get();
        currentProduct.setProductId(newProduct.getProductId());
        currentProduct.setName(newProduct.getName());
        currentProduct.setDescription(newProduct.getDescription());
        currentProduct.setPrice(newProduct.getPrice());
        currentProduct.setImagePath(newProduct.getImagePath());


        this.productRepository.save(currentProduct);
        return currentProduct;
    }


    public Product update(Product updatedProduct, UUID id) throws NotFoundException{
        Optional<Product> optionalProduct = this.productRepository.findById(id);

        if(optionalProduct.isEmpty()){
            throw new NotFoundException("Product with id: " + id + " not found");
        }

        Product currentProduct = optionalProduct.get();
        currentProduct.setProductId(updatedProduct.getProductId());
        currentProduct.setName(updatedProduct.getName());
        currentProduct.setDescription(updatedProduct.getDescription());
        currentProduct.setPrice(updatedProduct.getPrice());
        currentProduct.setImagePath(updatedProduct.getImagePath());

        this.productRepository.save(currentProduct);
        return currentProduct;
    }

    public void delete(UUID id) throws NotFoundException{
        Optional<Product> optionalProduct = this.productRepository.findById(id);

        if(optionalProduct.isEmpty()){
            throw new NotFoundException("Product with id: " + id + " not found");
        }

        Product product = optionalProduct.get();
        this.productRepository.delete(product);
    }
}

