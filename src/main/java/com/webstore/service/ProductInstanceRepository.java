package com.webstore.service;

import com.webstore.domain.ProductInstance;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductInstanceRepository extends CrudRepository<ProductInstance, Long> {

    @Query(value = "select * from product_instances where id in (" +
                   "    select product_instance_id from store where status = 'available'" +
                   "    )",
           nativeQuery = true)
    List<ProductInstance> findAllAvailableProductInstances();
}
