package com.generation.phamarcy.repository;

import com.generation.phamarcy.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    public List<Product> findAllByNameContainingIgnoreCase(@Param("name") String name);
}
