package com.earthquake.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.earthquake.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
