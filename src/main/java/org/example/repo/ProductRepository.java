package org.example.repo;

import org.example.model.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> findAllById(Iterable<Integer> ids);
    List<Product> findAll();
}
