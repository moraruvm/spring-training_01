package org.example.model;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private final Map<Integer, Integer> items;

    public Cart() {
        this.items = new HashMap<>();
    }

    public Map<Integer, Integer> getItems() {
        return items;
    }

    public Cart withAmount(Integer productId, Integer quantity) {
        items.put(productId, quantity);
        return this;
    }
}
