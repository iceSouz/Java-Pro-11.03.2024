package stream_api;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class ProductService {
    public static List<Product> getAllProductsOverPrice(List<Product> products, String type, double price) {
        return products.stream()
                .filter(p -> p.getType().equalsIgnoreCase(type) && p.getPrice() > price)
                .collect(Collectors.toList());
    }

    public static List<Product> getDiscountedProducts(List<Product> products, String type) {
        return products.stream()
                .filter(p -> p.getType().equalsIgnoreCase(type))
                .map(p -> Product.builder()
                        .discount(p.getDiscount())
                        .type(p.getType())
                        .price(p.getPrice() * (1 - p.getDiscount() / 100.0))
                        .build()
                )
                .toList();
    }

    public static Product getCheapestProduct(List<Product> products, String type) {
        return products.stream()
                .filter(p -> p.getType().equalsIgnoreCase(type))
                .min(Comparator.comparing(Product::getPrice))
                .orElseThrow(() -> new NoSuchElementException("No " + type + " products found"));
    }

    public static List<Product> getThreeLatestAddedProducts(List<Product> products) {
        return products.stream()
                .sorted(Comparator.comparing(Product::getAddedDate).reversed())
                .limit(3)
                .toList();
    }

    public static double calculateTotalCostOfProduct(List<Product> products, double price, int year, String type) {
        return products.stream()
                .filter(p -> p.getAddedDate().getYear() == year
                        && p.getPrice() <= price
                        && p.getType().equalsIgnoreCase(type))
                .mapToDouble(Product::getPrice)
                .sum();
    }

    public static Map<String, List<Product>> groupProductsByType(List<Product> products) {
        return products.stream()
                .collect(Collectors.groupingBy(p -> p.getType().toUpperCase()));
    }
}