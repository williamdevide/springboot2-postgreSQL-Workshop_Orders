package com.earthquake.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.earthquake.course.entities.Order;
import com.earthquake.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
