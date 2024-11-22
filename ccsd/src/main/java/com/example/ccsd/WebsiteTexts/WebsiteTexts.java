package com.example.ccsd.WebsiteTexts;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "websitetexts")
public class WebsiteTexts {
  @Id
  private String id;
  private String title;
  private String status;
  private String place;
  private String tag;
  private String postShortDescription;
  private String postSlug;
  private String content;
  private String date;
  private byte[] image;

  public WebsiteTexts(){}

  public WebsiteTexts(String id,String title, String status, String place, String tag,String postShortDescription, String postSlug, String content, String date, byte[] image){
    this.id = id;
    this.title = title;
    this.status = status;
    this.place = place;
    this.tag = tag;
    this.postShortDescription = postShortDescription;
    this.postSlug = postSlug;
    this.content = content;
    this.date = date;
    this.image = image;
}

public String getId() {
    return id;
}

public void setId(String id) {
    this.id = id;
}

public String getTitle(){
  return title;
}

public void setTitle(String title) {
  this.title = title;
}

public String getStatus(){
  return status;
}

public void setStatus(String status) {
  this.status = status;
}

public String getPlace(){
  return place;
}

public void setPlace(String place) {
  this.place = place;
}

public String getTag(){
  return tag;
}

public void setTag(String tag) {
  this.tag = tag;
}

public String getPostShortDescription(){
  return postShortDescription;
}

public void setPostShortDescription(String postShortDescription) {
  this.postShortDescription = postShortDescription;
}

public String getPostSlug(){
  return postSlug;
}

public void setPostSlug(String postSlug) {
  this.postSlug = postSlug;
}

public String getContent(){
  return content;
}

public void setContent(String content) {
  this.content = content;
}

public String getDate(){
  return date;
}

public void setDate(String date) {
  this.date = date;
}

public byte[] getImage() {
  return this.image;
}

public void setImage(byte[] image) {
  this.image = image;
}


}



