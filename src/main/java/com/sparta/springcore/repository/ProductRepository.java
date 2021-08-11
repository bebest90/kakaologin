package com.sparta.springcore.repository;

import com.sparta.springcore.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Component

// Inversion of Control (IoC) 컨테이너
// bean 이라고 부름
//@Component

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByUserId(Long userId);
}
