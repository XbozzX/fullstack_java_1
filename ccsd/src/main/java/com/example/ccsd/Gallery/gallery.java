package com.example.ccsd.Gallery;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Gallery")
public class gallery {
    @Id
    private String id;
    private String title;
    private String images;
    private String text;
    private String description;
    private Date date;

    public gallery(){}

    public gallery(String id, String title, String images, String text, String description, Date date){
        this.id = id;
        this.title = title;
        this.images = images;
        this.text = text;
        this.description = description;
        this.date = date;
    }

    //getter method
    public String getId(){
        return id;
    }

    //setter method
    public void setId(String id){
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public String getImages(){
        return images;
    }

    public void setImages(String images){
        this.images = images;
    }

    public String getText(){
        return text;
    }

    public void setText(String text){
        this.text = text;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public Date getDate(){
         return date;
     }

     public void setDate(Date date){
         this.date = date;
  }
}

    

    //  public static void main(String[] args) {
    //       gallery myGallery = new gallery();
    //        myGallery.setImages("image1.jpg");
    //       myGallery.setImages("image2.jpg");
    //       myGallery.setDescription("Hai Cantik tak saya ?");
    //      myGallery.setDescription("Hensem kan ");

    //      System.out.println(myGallery.getImages());
    //      System.out.println(myGallery.getDescription());
    //      System.out.println(myGallery.getDate());
    


