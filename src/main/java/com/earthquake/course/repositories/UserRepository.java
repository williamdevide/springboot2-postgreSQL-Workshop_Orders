package com.earthquake.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.earthquake.course.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{

}
