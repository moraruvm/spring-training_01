package org.example.repo;

import org.example.model.Product;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public interface H2ProductRepository extends JpaRepository<Product, Integer> {
}
