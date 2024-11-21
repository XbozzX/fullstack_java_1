package com.example.ccsd.WebsiteImages;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class WebsiteImagesService {
    

    @Autowired
    private WebsiteImagesRepository websiteImagesRepository;

    // Getting all 
    public List<WebsiteImages> getAllWebsiteImageses() {
        return websiteImagesRepository.findAll();
    }

    // Getting single 
    public Optional<WebsiteImages> getWebsiteImagesById(String id) {
        return websiteImagesRepository.findById(id);
    }

    // Creating new data in repository

    public WebsiteImages addWebsiteImages(WebsiteImages websiteImages) {
        return websiteImagesRepository.save(websiteImages);
    }

        // Updating 

        public WebsiteImages updateWebsiteImages(String id, WebsiteImages websiteImagesDetails) {
            Optional<WebsiteImages> websiteImagesOpt = websiteImagesRepository.findById(id);
            if (websiteImagesOpt.isPresent()) {
    
                // Get from database
    
                WebsiteImages websiteImages = websiteImagesOpt.get();
                websiteImages.setImage(websiteImagesDetails.getimage());
                websiteImages.setuploadDate(websiteImages.getuploadDate());
                websiteImages.setgalleryImage(websiteImagesDetails.getgalleryImage());
                websiteImages.setintroductionImage(websiteImagesDetails.getintroductionImage());
                return websiteImagesRepository.save(websiteImages);
            }
            return null;
        }

        // Deleting
        
        public void deleteBook(String id) {
            websiteImagesRepository.deleteById(id);
        }
    
}