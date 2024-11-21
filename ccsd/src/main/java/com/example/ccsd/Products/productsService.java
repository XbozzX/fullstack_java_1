package com.example.ccsd.Products;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class productsService {
    
    @Autowired
    private productsRepository ProductsRepository;

    // Getting all books
    public List<products> getAllProducts() {
        return ProductsRepository.findAll();
    }

    // Getting single boks
    public Optional<products> getProductsById(String id) {
        return ProductsRepository.findById(id);
    }

    // Creating new data in repository

    public products addProducts(products Products) {
        return ProductsRepository.save(Products);
    }

    // Updating the book

    public products updateProducts(String id, products ProductsDetail) {
        Optional<products> ProductsOpt = ProductsRepository.findById(id);
        if (ProductsOpt.isPresent()) {

            // Get from database

            products Products = ProductsOpt.get();
            Products.setProdcut(ProductsDetail.getProdcut());
            Products.setTitle(ProductsDetail.getTitle());
            Products.setSlug(ProductsDetail.getSlug());
            Products.setPublishingData(ProductsDetail.getPublishingData());
            Products.setStatus(ProductsDetail.getStatus());
            Products.setProductPlace(ProductsDetail.getProductPlace());
            Products.setTags(ProductsDetail.getTags());
            Products.setDescription(ProductsDetail.getDescription());
            Products.setLongDescription(ProductsDetail.getLongDescription());
            return ProductsRepository.save(Products);
    
        }
        return null;
    }

    // Deleting
    
    public void deleteProducts(String id) {
        ProductsRepository.deleteById(id);
    }
}