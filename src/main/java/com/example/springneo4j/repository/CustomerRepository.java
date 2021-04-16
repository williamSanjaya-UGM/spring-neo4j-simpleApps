package com.example.springneo4j.repository;

import com.example.springneo4j.node.Customer;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface CustomerRepository extends Neo4jRepository<Customer,Integer> {
    Customer findByName(String name);
}
