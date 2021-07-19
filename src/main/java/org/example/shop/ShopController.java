package org.example.shop;

import org.example.model.Cart;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopController {

    // TODO - call the ShopService to calculate the total amount needed for the products in the cart
    @PostMapping
    public int buy(Cart cart) {
        return 0;
    }

}
