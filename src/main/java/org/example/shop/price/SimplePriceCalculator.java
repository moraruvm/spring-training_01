package org.example.shop.price;

import org.example.model.Purchase;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SimplePriceCalculator implements PriceCalculator {
    public double getTotal(List<Purchase> purchases) {
        return purchases.stream().mapToDouble(purchase -> {
            double price = purchase.getProduct().getPrice();
            int quantity = purchase.getQuantity();
            return price * quantity;
        }).sum();
    }
}
