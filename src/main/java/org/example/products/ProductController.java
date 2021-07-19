package org.example.products;

import org.example.model.Product;
import org.example.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    private final ProductRepository productRepository;

    @Autowired
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/greeting")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/products")
    public List<Product> getProducts() {
        return productRepository.findAll();
    }
}
