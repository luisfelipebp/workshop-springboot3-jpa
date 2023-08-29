package com.luisfelipebp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luisfelipebp.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}

