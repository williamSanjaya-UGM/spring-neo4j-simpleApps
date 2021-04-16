package com.example.springneo4j.repository;

import com.example.springneo4j.node.Product;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface ProductRepository extends Neo4jRepository<Product,Integer> {
}
