package com.webstore.service;

import com.webstore.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("productService")
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return (List<Product>) productRepository.findAll();
    }
}
