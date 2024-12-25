package com.moretolearn.repository.order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moretolearn.model.order.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
}

