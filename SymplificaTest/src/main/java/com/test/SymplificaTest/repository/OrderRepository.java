package com.test.SymplificaTest.repository;

import com.test.SymplificaTest.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
