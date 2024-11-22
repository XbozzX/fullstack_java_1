package com.example.ccsd.Products;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "products")
public class products {
    
    //field
    @Id
    private String author;
    private String postShortDescription;   
    private String tag;
    private String place;
    private String title;
    private String postSlug;
    private String content;
    private String status;
    private Date date;




    //Constructors
    public products() {}

    public products(String author, String postShortDescription, String tag, String place, String title, String postSlug, String content, String status, Date date) {
        this.author = author;
        this.postShortDescription = postShortDescription;
        this.tag = tag;
        this.place = place;
        this.title = title;
        this.postSlug = postSlug;
        this.content = content;
        this.status = status;
        this.date = date;
    }


    // setter
    public void setAuthors(String author) {
        this.author = author;
    }

    public void setPostShortDescription(String postShortDescription){
        this.postShortDescription = postShortDescription;
    }

    public void setTag(String tag){
         this.tag = tag;
    }

    public void setPlace(String place){
        this.place = place;
    }
    public void setTitle(String title){
         this.title = title;
    }

    public void setPostSlug(String postSlug) {
        this.postSlug = postSlug;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDate(Date date){
         this.date = date;
    }


    // getter
    public String getAuthors() {
        return this.author;
    }

    public String getPostShortDescription(){
        return this.postShortDescription;
    }

    public String getTag(){
         return this.tag;
    }

    public String getPlace(){
        return this.place;
    }
    public String getTitle(){
         return this.title;
    }

    public String getPostSlug() {
        return this.postSlug;
    }

    public String getContent() {
        return this.content;
    }

    public String getStatus() {
        return this.status;
    }

    public Date getDate(){
         return this.date;
    }

}
