package org.example;

import org.example.model.Cart;
import org.example.shop.PromoShopService;
import org.example.shop.ShopService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ShoppingApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ShopService shop = context.getBean(ShopService.class);

        Cart cart = new Cart();
        cart.withAmount(1, 3);
        cart.withAmount(2, 3);
        cart.withAmount(3, 3);

        shop.purchase(cart);

        ShopService promoShop = context.getBean(PromoShopService.class);
        promoShop.purchase(cart);
    }
}
