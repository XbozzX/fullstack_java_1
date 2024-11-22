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
            Products.setAuthors(ProductsDetail.getAuthors());
            Products.setPostShortDescription(ProductsDetail.getPostShortDescription());
            Products.setTag(ProductsDetail.getTag());
            Products.setPlace(ProductsDetail.getPlace());
            Products.setTitle(ProductsDetail.getTitle());
            Products.setPostSlug(ProductsDetail.getPostSlug());
            Products.setContent(ProductsDetail.getContent());
            Products.setStatus(ProductsDetail.getStatus());
            Products.setDate(ProductsDetail.getDate());
            return ProductsRepository.save(Products);
    
        }
        return null;
    }

    // Deleting
    
    public void deleteProducts(String id) {
        ProductsRepository.deleteById(id);
    }
}