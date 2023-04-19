package com.generation.phamarcy.repository;

import com.generation.phamarcy.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    public List<Category> findAllByDescriptionContainingIgnoreCase(@Param("description") String description);
}
