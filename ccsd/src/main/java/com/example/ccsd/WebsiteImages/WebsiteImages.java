package com.example.ccsd.WebsiteImages;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "WebsiteImages")
public class WebsiteImages {
    
    @Id
    private String id;
    private String image;
    private Date uploadDate;
    private String galleryImage;
    private String introductionImage;
    
    
    public WebsiteImages() {}

    public WebsiteImages(String image, Date uploadDate, String galleryImage, String introductionImage) {
        this.image = image;
        this.uploadDate = uploadDate;
        this.galleryImage = galleryImage;
        this.introductionImage = introductionImage;
    }

public String getId(){
    return id;
}

public void setId(String id) {
    this.id = id;
}


public String getimage() {
    return image;
} 

public void setimage(String image) {
    this.image = image;
}


public Date getuploadDate(){
    return uploadDate;
}

public void setuploadDate(Date uploadDate) {
    this.uploadDate = uploadDate;
}

public String getgalleryImage(){
    return galleryImage;
}

public void setgalleryImage(String galleryImage) {
    this.galleryImage = galleryImage;
}

public String getintroductionImage(){
    return introductionImage;
}

public void setintroductionImage(String introductionImage) {
    this.introductionImage = introductionImage;
}

}
