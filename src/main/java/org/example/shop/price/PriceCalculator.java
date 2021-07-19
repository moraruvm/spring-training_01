package org.example.shop.price;

import org.example.model.Purchase;

import java.util.List;

public interface PriceCalculator {
    double getTotal(List<Purchase> purchases);
}
