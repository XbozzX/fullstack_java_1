package com.example.ccsd.Products;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.mock.web.MockMultipartFile;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ProductsServiceTest {

    @Mock
    private ProductsRepository productsRepository;

    @InjectMocks
    private ProductsService productsService;

    private Products products;

    @BeforeEach
    void setup() throws Exception{

        MockMultipartFile image = new MockMultipartFile(
                "image",
                "test.jpg",
                "image/jpeg",
                "fake-image".getBytes()
        );

        byte[] imageBytes = image.getBytes();  // Get image data

        products = new Products();
        products.setId("1");
        products.setTitle("Test Title");
        products.setPostSlug("Test postSlug");
        products.setPostShortDescription("Test postShortDescription");
        products.setTag("Test tag");
        products.setPlace("Test place");
        products.setDateProduct("Test Date");
        products.setStatus("Test status");
        products.setImageStore(imageBytes);
    }

    @Test
    void testAddProducts() {
        when(productsRepository.save(any()))
                .thenReturn(products);

        Products savedProducts = productsService.addProducts(products);

        assertNotNull(savedProducts);
        assertEquals("Test Title", savedProducts.getTitle());

        verify(productsRepository).save(products);

    }

    @Test
    void testGetAllProducts() {
        when(productsRepository.findAll())
                .thenReturn(List.of(products));

        List<Products> getProducts = productsService.getAllProducts();

        assertNotNull(getProducts);

        verify(productsRepository, times(1)).findAll();
    }

    @Test
    void testGetProductById() {
        when(productsRepository.findById(products.getPostSlug()))
                .thenReturn(Optional.of(products));

        Optional<Products> findByPostSlug = productsService.getProductsById(products.getPostSlug());

        assertNotNull(findByPostSlug);
        assertTrue(findByPostSlug.isPresent());
        verify(productsRepository, times(1)).findById(products.getPostSlug());
    }


//    @Test
//    void testDeleteProduct() {
//        when(productsRepository.findById("1"))
//                .thenReturn(Optional.of(products));
//
//        productsService.deleteProducts("1");
//
//        Optional<Products> products1 = productsService.getProductsById("1");
//
//        assertNull(products1);
//
//        verify(productsRepository, times(1)).findById(products.getId());
//    }
}
