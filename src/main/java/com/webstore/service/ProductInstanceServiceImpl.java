package com.webstore.service;

import com.webstore.domain.ProductInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("productInstanceService")
public class ProductInstanceServiceImpl implements ProductInstanceService{

    @Autowired
    private ProductInstanceRepository productInstanceRepository;

    @Override
    public List<ProductInstance> getAllAvailableProductInstances() {
        return productInstanceRepository.findAllAvailableProductInstances();
    }
}
