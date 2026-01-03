package com.example.ccsd;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;


@Configuration
public class WebConfig {

    @Value("${spring.data.mongodb.uri}")
    private String uri;

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/**")
                        .allowedOrigins("http://localhost:3000")
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Allow OPTIONS method
                        .allowedHeaders("*") // Allow all headers
                        .exposedHeaders("Authorization") // In case you need to expose any headers
                        .allowCredentials(false) // In case you're not using cookies or authentication
                        .maxAge(3600); // Cache the preflight request for 1 hour
            }

            @Override
            public void addResourceHandlers(ResourceHandlerRegistry registry) {
                registry.addResourceHandler("/images/**")
                        .addResourceLocations("classpath:/static/images/");
            }
        };
    }
    
    @Bean
    public MongoClient mongoClient() {
        return MongoClients.create(uri);
    }
}

