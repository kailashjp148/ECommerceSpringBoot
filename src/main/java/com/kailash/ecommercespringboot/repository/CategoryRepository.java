package com.kailash.ecommercespringboot.repository;

import com.kailash.ecommercespringboot.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {

     Optional<Category> findByName(String name);
}
