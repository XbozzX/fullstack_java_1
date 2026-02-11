package com.example.ccsd.Products;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductsService {
    
    @Autowired
    private com.example.ccsd.Products.ProductsRepository ProductsRepository;

    // Getting all books
    public List<Products> getAllProducts() {
        return ProductsRepository.findAll();
    }

    // Getting single boks
    public Optional<Products> getProductsById(String postSlug) {
        return ProductsRepository.findById(postSlug);
    }

    // Creating new data in repository

    public Products addProducts(Products Products) {
        return ProductsRepository.save(Products);
    }

    // Updating the book

    public Products updateProducts(String id, Products ProductsDetail) {
        Optional<Products> ProductsOpt = ProductsRepository.findById(id);
        if (ProductsOpt.isPresent()) {

            // Get from database
            Products products = ProductsOpt.get();
             // list to get the database
            products.setAuthor(ProductsDetail.getAuthor());
            products.setPostShortDescription(ProductsDetail.getPostShortDescription());
            products.setTag(ProductsDetail.getTag());
            products.setPlace(ProductsDetail.getPlace());
            products.setTitle(ProductsDetail.getTitle());
            products.setPostSlug(ProductsDetail.getPostSlug());
            products.setContent(ProductsDetail.getContent());
            products.setStatus(ProductsDetail.getStatus());
            products.setDateProduct(ProductsDetail.getDateProduct());
            products.setImageStore(ProductsDetail.getImageStore());
            return ProductsRepository.save(products);
    
        }
        return null;
    }

    // Deleting
    public void deleteProducts(String id) {
        ProductsRepository.deleteById(id);
    }

    
}