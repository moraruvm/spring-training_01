package org.example;

import org.example.model.Cart;
import org.example.price.SimplePriceCalculator;
import org.example.products.DummyProductRepository;
import org.example.shop.SimpleShopService;

public class ShoppingApp {
    public static void main(String[] args) {
        SimpleShopService shop = new SimpleShopService(new SimplePriceCalculator(), new DummyProductRepository());

        Cart cart = new Cart();
        cart.withAmount(1, 3);
        cart.withAmount(2, 3);
        cart.withAmount(3, 3);

        shop.purchase(cart);
    }
}
