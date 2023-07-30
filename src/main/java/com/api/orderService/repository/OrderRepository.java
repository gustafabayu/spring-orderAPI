package com.api.orderService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.orderService.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
