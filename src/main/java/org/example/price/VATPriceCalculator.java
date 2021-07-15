package org.example.price;

import org.example.model.Purchase;

import java.util.List;

public class VATPriceCalculator implements PriceCalculator {

    private double taxRate;

    public VATPriceCalculator(double taxRate) {
        this.taxRate = taxRate;
    }

    @Override
    public double getTotal(List<Purchase> purchases) {
        double sum = purchases.stream().mapToDouble(purchase -> {
            double price = purchase.getProduct().getPrice();
            int quantity = purchase.getQuantity();
            return price * quantity;
        }).sum();

        return sum + sum * taxRate;
    }
}
