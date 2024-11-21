package com.example.ccsd.Products;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "products")
public class products {
    
    //field
    @Id
    private String id;
    private String product;
    private String title;   
    private String slug;
    private Date publishingDate;
    private String status;
    private String productPlace;
    private String tags;
    private String description;
    private String longDescription;

    //Constructors
    public products() {}

    public products(String product, String title, String slug, Date publishingDate, String status, String productPlace, String tags, String description, String longDescription) {
        this.product = product;
        this.title = title;
        this.slug = slug;
        this.publishingDate = publishingDate;
        this.status = status;
        this.productPlace = productPlace;
        this.tags = tags;
        this.description = description;
        this.longDescription = longDescription;
    }


    // setter
    public void setProdcut(String product) {
        this.product = product;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setSlug(String slug){
         this.slug = slug;
    }

    public void setPublishingData(Date publishingDate){
        this.publishingDate = publishingDate;
    }

    public void setStatus(String status){
         this.status = status;
    }

    public void setProductPlace(String productPlace) {
        this.productPlace = productPlace;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLongDescription(String longDescription){
         this.longDescription = longDescription;
    }


    // getter
    public String getProdcut() {
        return this.product;
    }

    public String getTitle(){
        return this.title;
    }

    public String getSlug(){
        return this.slug;
    }

    public Date getPublishingData(){
        return this.publishingDate;
    }

    public String getStatus(){
        return this.status;
    }

    public String getProductPlace() {
        return this.productPlace;
    }

    public String getTags() {
        return this.tags;
    }

    public String getDescription() {
        return this.description;
    }

    public String getLongDescription(){
        return this.longDescription;
    }

}
