package org.example.shop;

import org.example.model.Cart;
import org.example.model.Product;
import org.example.model.Purchase;
import org.example.price.PriceCalculator;
import org.example.products.ProductRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SimpleShopService implements ShopService {

    private final PriceCalculator priceCalculator;

    private final ProductRepository productRepository;

    public SimpleShopService(PriceCalculator priceCalculator, ProductRepository productRepository) {
        this.priceCalculator = priceCalculator;
        this.productRepository = productRepository;
    }

    @Override
    public void purchase(Cart cart) {
        Map<Integer, Product> productsById = getById(cart.getItems().keySet());
        List<Purchase> quantities = getPurchases(cart.getItems(), productsById);

        double total = priceCalculator.getTotal(quantities);

        System.out.println("Purchased the following items for " + total + ":");
        quantities.stream().map(product -> "- " + product).forEach(System.out::println);
    }

    private Map<Integer, Product> getById(Collection<Integer> productIds) {
        Set<Product> products = productRepository.find(productIds);
        return products.stream().collect(Collectors.toMap(Product::getId, Function.identity()));
    }

    private List<Purchase> getPurchases(Map<Integer, Integer> quantities,
                                                Map<Integer, Product> productsById) {
        List<Purchase> purchases = new ArrayList<>();
        for(Map.Entry<Integer, Integer> e : quantities.entrySet()) {
            Product product = productsById.get(e.getKey());
            int quantity = e.getValue();
            purchases.add(new Purchase(product, quantity));
        }
        return purchases;
    }

}
