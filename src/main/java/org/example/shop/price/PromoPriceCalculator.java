package org.example.shop.price;

import org.example.Promo;
import org.example.model.Purchase;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Promo
public class PromoPriceCalculator implements PriceCalculator {
    @Override
    public double getTotal(List<Purchase> purchases) {
        return purchases.stream().mapToDouble(purchase -> {
            double price = purchase.getProduct().getPrice();
            int quantity = purchase.getQuantity();
            return price * quantity;
        }).sum() * .8;
    }
}
