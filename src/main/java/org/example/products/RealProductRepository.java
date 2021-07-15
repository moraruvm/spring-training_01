package org.example.products;

import org.example.model.Product;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Set;

@Repository
public class RealProductRepository implements ProductRepository {
    @Override
    public Set<Product> find(Collection<Integer> ids) {
        return null;
    }
}
