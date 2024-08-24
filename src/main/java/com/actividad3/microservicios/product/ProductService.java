package com.actividad3.microservicios.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProduct(Product product) {
        productRepository.delete(product);
    }

    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    public Product getProduct(int id) {
        return productRepository.getReferenceById(id);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
