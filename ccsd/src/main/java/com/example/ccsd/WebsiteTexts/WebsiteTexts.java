package com.example.ccsd.WebsiteTexts;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "websitetexts")
public class WebsiteTexts {
  @Id
  private String id;
  private String text;
  private String description;
  private String caption;
  private String title;
  private String subtitle;
  private String about;

  public WebsiteTexts(){}

  public WebsiteTexts(String id,String text, String description, String caption, String title, String subtitle, String about){
    this.id = id;
    this.text = text;
    this.description = description;
    this.caption = caption;
    this.title = title;
    this.subtitle = subtitle;
    this.about = about;
  }

  public String getId() {
    return id;
}

public void setId(String id) {
    this.id = id;
}

  public String getText(){
    return text;
  }

  public void setText(String text) {
    this.text = text;
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

  public String getAbout(){
    return about;
  }
}
