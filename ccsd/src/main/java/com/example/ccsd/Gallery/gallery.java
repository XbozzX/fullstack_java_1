package com.example.ccsd.Gallery;

import java.util.Date;

public class gallery {
    private String images;
    private String description;
    private Date date;

    public String getImages(){
        return images;
    }

    public void setImages(String newImages){
        this.images = newImages;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String newDescription){
        this.description = newDescription;
    }

    public Date getDate(){
        return date;
    }

    public void setDate(String newDate){
        this.images = newDate;
    }


    // public static void main(String[] args) {
    //     gallery myGallery = new gallery();
    //     myGallery.setImages("image1.jpg");
    //     myGallery.setImages("image2.jpg");
    //     myGallery.setDescription("Hai Cantik tak saya ?");
    //     myGallery.setDescription("Hensem kan ");

    //     System.out.println(myGallery.getImages());
    //     System.out.println(myGallery.getDescription());
    //     System.out.println(myGallery.getDate());
    
}
