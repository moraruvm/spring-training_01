package org.example.shop;

import org.example.Promo;
import org.example.shop.price.PriceCalculator;
import org.example.repo.ProductRepository;
import org.springframework.stereotype.Service;

@Service
@Promo
public class PromoShopService extends AbstractShopService {

    public PromoShopService(@Promo PriceCalculator priceCalculator, ProductRepository productRepository) {
        super(priceCalculator, productRepository);
    }
}
