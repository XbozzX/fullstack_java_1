package com.example.ccsd.WebsiteTexts;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class WebsiteTextsService {

    @Autowired
    private WebsiteTextsRepository websiteTextsRepository;

    public List<WebsiteTexts> getAllText() {
        return websiteTextsRepository.findAll();
    }
    
    public Optional<WebsiteTexts> getTextById(String id) {
        return websiteTextsRepository.findById(id);
    }

    public WebsiteTexts addText(WebsiteTexts websiteTexts) {
        return websiteTextsRepository.save(websiteTexts);
    }

    // Updating 

    public WebsiteTexts updateText(String id, WebsiteTexts textDetails) {
        Optional<WebsiteTexts> textOpt = websiteTextsRepository.findById(id);
        if (textOpt.isPresent()) {

            // Get from database

            WebsiteTexts websiteTexts = textOpt.get();
            websiteTexts.setTitle(textDetails.getTitle());
            websiteTexts.setStatus(textDetails.getStatus());
            websiteTexts.setPlace(textDetails.getPlace());
            websiteTexts.setTag(textDetails.getTag());
            websiteTexts.setPostShortDescription(textDetails.getPostShortDescription());
            websiteTexts.setPostSlug(textDetails.getPostSlug());
            websiteTexts.setContent(textDetails.getContent());
            websiteTexts.setDate(textDetails.getDate());
            websiteTexts.setImage(textDetails.getImage());
            return websiteTextsRepository.save(websiteTexts);

        }
        return null;
    }


    // Deleting
    
    public void deleteText(String id) {
        websiteTextsRepository.deleteById(id);
    }










}
