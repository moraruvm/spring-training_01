package org.example.price;

import org.example.model.Purchase;

import java.util.List;

public class SimplePriceCalculator implements PriceCalculator {
    public double getTotal(List<Purchase> purchases) {
        return purchases.stream().mapToDouble(purchase -> {
            double price = purchase.getProduct().getPrice();
            int quantity = purchase.getQuantity();
            return price * quantity;
        }).sum();
    }
}
