package com.webstore.service;

import com.webstore.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
//    List<Product> findAll();
}
