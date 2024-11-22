package com.example.ccsd.Gallery;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Gallery")
public class gallery {
    @Id
    private String id;
    private String title;
    private byte[] image;
    private String postShortDescription;
    private String date;
    private String status;
    private String tag;
    private String place;
    private String postSlug;
    private String content;



    public gallery(){}

    public gallery
    (String id, String title, byte[] image, String postShortDescription, String date, 
    String status, String tag, String place, String postSlug, String content )
    {
        this.id = id;
        this.title = title;
        this.image = image;
        this.postShortDescription = postShortDescription;
        this.date = date;
        this.status = status;
        this.tag = tag;
        this.place = place;
        this.postSlug = postSlug;
        this.content = content;
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
    public byte[] getimage(){
        return image;
    }

    public void setimage(byte[] image){
        this.image = image;
    }

    public String getpostShortDescription(){
        return postShortDescription;
    }

    public void setpostShortDescription(String postShortDescription){
        this.postShortDescription = postShortDescription;
    }

    public String getDate(){
         return date;
     }

     public void setDate(String date){
         this.date = date;
     }

     public String getStatus(){
        return status;
     }

     public void setStatus(String status){
        this.status = status;
    }

     public String getTag(){
        return tag;
     }

     public void setTag(String tag){
        this.tag = tag;
    }

     public String getPlace(){
        return place;
     }

     public void setPlace(String place){
        this.place = place;
    }

     public String getPostSlug(){
        return postSlug;
     }

     public void setPostSlug(String postSlug){
        this.postSlug = postSlug;
    }

     public String getContent(){
        return content;
     }

     public void setContent(String content){
        this.content = content;
    }

}


