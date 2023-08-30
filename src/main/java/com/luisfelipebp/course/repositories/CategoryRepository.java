package com.luisfelipebp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luisfelipebp.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}

