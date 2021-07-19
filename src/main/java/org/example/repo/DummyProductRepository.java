package org.example.repo;

import org.example.model.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Repository
public class DummyProductRepository implements ProductRepository {

    private final Map<Integer, Product> products;

    public DummyProductRepository() {
        this.products = List.of(
                new Product(1, "Laptop", 1500),
                new Product(2, "Headphones", 200),
                new Product(3, "Keyboard", 100)
        ).stream().collect(Collectors.toMap(Product::getId, Function.identity()));

    }

    @Override
    public List<Product> findAllById(Iterable<Integer> ids) {
        return StreamSupport.stream(ids.spliterator(), false).map(this.products::get).collect(Collectors.toList());
    }

    @Override
    public List<Product> findAll() {
        return products.values().stream().collect(Collectors.toList());
    }
}
