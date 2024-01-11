package com.ecommerce.microservice.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.microservice.orderservice.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
