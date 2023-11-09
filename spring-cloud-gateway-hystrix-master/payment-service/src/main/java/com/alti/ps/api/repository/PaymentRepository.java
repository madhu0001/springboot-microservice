package com.alti.ps.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alti.ps.api.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment,Integer> {
    Payment findByOrderId(int orderId);
}

