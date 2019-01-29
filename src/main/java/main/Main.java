package main;

import Strategy.CountDiscountStrategy;
import Strategy.CountDiscountStrategyFactory;
import Strategy.DiscountType;
import product.Product;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("== RTV/AGD Store ==");
        Product productOne = new Product("Samsung TV 55",
                "Samsung TV with a screen size of 55 inches",
                2400.00);

        Product productTwo = new Product("Bosch Fridge",
                "No frost fridge", 1400.00);

        Product productThree = new Product("Electrolux Washing Machine",
                "Very quiet washing machine", 2200.0);

        Product productFour = new Product("Iron",
                "Easy to handle!", 150.00);

        List<Product> products =
                Arrays.asList(productOne, productTwo, productThree, productFour);


        CountDiscountStrategyFactory discountFactory = new CountDiscountStrategyFactory();

        CountDiscountStrategy countDiscountStrategy = discountFactory.getStrategy(DiscountType.CHRISTMAS);

        System.out.println("Christmas time ...");
        products.forEach(p -> p.setDiscount(countDiscountStrategy.countDiscount(p.getCost())));
        products.forEach(p -> p.showProductInfo());

        CountDiscountStrategy countDiscountStrategy2 = discountFactory.getStrategy(DiscountType.NEW_YEAR);

        System.out.println("\n\nNew Yer time ...");
        products.forEach(p -> p.setDiscount(countDiscountStrategy2.countDiscount(p.getCost())));
        products.forEach(p -> p.showProductInfo());

        CountDiscountStrategy countDiscountStrategy3 = discountFactory.getStrategy(DiscountType.EASTER);

        System.out.println("\n\nEaster time ...");
        products.forEach(p -> p.setDiscount(countDiscountStrategy3.countDiscount(p.getCost())));
        products.forEach(p -> p.showProductInfo());

    }
}
