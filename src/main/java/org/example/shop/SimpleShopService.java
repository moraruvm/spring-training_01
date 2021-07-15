package org.example.shop;

import org.example.price.PriceCalculator;
import org.example.products.ProductRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class SimpleShopService extends AbstractShopService {

    public SimpleShopService(PriceCalculator priceCalculator, ProductRepository productRepository) {
        super(priceCalculator, productRepository);
    }
}
