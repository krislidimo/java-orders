package com.lambdaschool.javaorders.repos;

import com.lambdaschool.javaorders.model.Agent;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Agent, Long> {
}
