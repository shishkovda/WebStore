package com.webstore.service;

import com.webstore.domain.ProductInstance;

import java.util.List;

public interface ProductInstanceService {

    List<ProductInstance> getAllAvailableProductInstances();
}
