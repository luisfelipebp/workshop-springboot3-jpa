package com.luisfelipebp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luisfelipebp.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}

