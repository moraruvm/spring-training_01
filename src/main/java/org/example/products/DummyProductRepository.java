package org.example.products;

import org.example.model.Product;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

@Repository
@Primary
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
    public Set<Product> find(Collection<Integer> ids) {
        return ids.stream().map(this.products::get).collect(Collectors.toSet());
    }

}
