package com.alti.os.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alti.os.api.entity.Order;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
