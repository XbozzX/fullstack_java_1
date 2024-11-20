package com.example.ccsd.Products;

import java.util.Date;

public class products {
    
    //field
    private String product;
    private String title;
    private String slug;
    private Date publishingDate;
    private String status;
    private String productPlace;
    private String tags;
    private String description;
    private String longDescription;

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

    public void setDate(Date publishingDate){
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

    public Date getDate(){
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
