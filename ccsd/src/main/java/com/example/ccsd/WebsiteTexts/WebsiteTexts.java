package com.example.ccsd.WebsiteTexts;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "websitetexts")
public class WebsiteTexts {
  @Id
  private String id;
  private String title;
  private String subtitle;
  private String description;
  private String caption;


  public WebsiteTexts(){}

  public WebsiteTexts(String id,String title, String subtitle, String description, String caption){
    this.id = id;
    this.title = title;
    this.subtitle = subtitle;
    this.description = description;
    this.caption = caption;


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

public String getSubtitle(){
  return subtitle;
}

public void setSubtitle(String subtitle) {
  this.subtitle = subtitle;
}

  public String getDescription(){
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
}

  public String getCaption(){
    return caption;
  }

  public void setCaption(String caption) {
    this.caption = caption;
}

 

 
}
