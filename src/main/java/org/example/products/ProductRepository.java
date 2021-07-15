package org.example.products;

import org.example.model.Product;

import java.util.Collection;
import java.util.Set;

public interface ProductRepository {
    Set<Product> find(Collection<Integer> ids);
}
