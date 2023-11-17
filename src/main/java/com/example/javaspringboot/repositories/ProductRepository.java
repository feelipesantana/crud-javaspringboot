package com.example.javaspringboot.repositories;


import java.util.UUID;
import com.example.javaspringboot.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, UUID> {
  
}
