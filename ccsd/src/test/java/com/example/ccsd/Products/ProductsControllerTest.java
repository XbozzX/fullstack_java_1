package com.example.ccsd.Products;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;


import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.multipart;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest (ProductsController.class)
public class ProductsControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ProductsService productsService;

    private Products products;

    @BeforeEach
    void setup() {

        products = new Products();
        products.setId("1");
        products.setAuthor("afham");
        products.setPostShortDescription("test short description");
        products.setTag("test tag");
        products.setPlace("test place");
        products.setTitle("Test Title");
        products.setPostSlug("test postSlug");
        products.setContent("test content");
        products.setStatus("test Status");
        products.setDateProduct("test dateProduct");
        products.setImageStore64String("image64");
    }

    @Test
    void testGetAllProducts() throws Exception {
            when(productsService.getAllProducts())
                    .thenReturn(List.of(products));

        mockMvc.perform(get("/api/products"))
                .andExpect(status().isOk());

        verify(productsService, times(1)).getAllProducts();
    }

    @Test
    void testGetProductsById() throws Exception{
        when(productsService.getProductsById("1"))
                .thenReturn(Optional.empty());

        mockMvc.perform(get("/api/products/1"))
                .andExpect(status().isNotFound());

        verify(productsService).getProductsById("1");
    }



    @Test
    void testAddProduct() throws Exception {

        MockMultipartFile image = new MockMultipartFile(
                "image",
                "test.jpg",
                "image/jpeg",
                "fake-image".getBytes()
        );

        when(productsService.addProducts(any())).thenReturn(products);

        MvcResult result = mockMvc.perform(multipart("/api/products")
                .file(image)
                .param("title", products.getTitle())
                .param("postSlug", products.getPostSlug())
                .param("postShortDescription", products.getPostShortDescription())
                .param("tag",products.getTag())
                .param("place",products.getPlace())
                .param("date", products.getDateProduct())
                .param("status", products.getStatus()))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.success").value(true))
                .andReturn();

        String response = result.getResponse().getContentAsString();
        assertTrue(response.contains("Test Title"));

        verify(productsService, times(1))
                .addProducts(any());
    }
}
