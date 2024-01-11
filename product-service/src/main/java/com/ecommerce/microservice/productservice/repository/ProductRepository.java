package com.ecommerce.microservice.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ecommerce.microservice.productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
}
