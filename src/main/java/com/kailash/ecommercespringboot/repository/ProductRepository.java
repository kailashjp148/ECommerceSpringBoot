package com.kailash.ecommercespringboot.repository;

import com.kailash.ecommercespringboot.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

    @Query("Select p from Product p where p.price > :minPrice")
    Product getExpensiveProduct(@Param("minPrice") Long minPrice);



}
