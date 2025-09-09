package com.example.hexagonal.hexagonalbasico.product.infrastructure.persistence.repository;

import com.example.hexagonal.hexagonalbasico.product.infrastructure.persistence.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface JpaProductRepository extends JpaRepository<ProductEntity, Long> {


}
