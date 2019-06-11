package com.lambdaschool.javaorders.repos;

import com.lambdaschool.javaorders.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
    Customer findByName(String name);
}
