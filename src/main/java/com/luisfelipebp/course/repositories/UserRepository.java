package com.luisfelipebp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luisfelipebp.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

