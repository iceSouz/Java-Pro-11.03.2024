package stream_api;

import java.time.LocalDate;
import java.util.UUID;

public class Product {
    private String type;
    private double price;
    private int discount;
    private LocalDate addedDate;
    private final UUID id;

    private Product(String type, double price, int discount, LocalDate addedDate, UUID id) {
        this.type = type;
        this.price = price;
        this.discount = discount;
        this.addedDate = addedDate;
        this.id = id;
    }

    public static ProductBuilder builder() {
        return new ProductBuilder();
    }

    static class ProductBuilder {
        private String type;
        private double price;
        private int discount;
        private LocalDate addedDate;
        private UUID id;

        public ProductBuilder type(String type) {
            this.type = type;
            return this;
        }

        public ProductBuilder price(double price) {
            this.price = price;
            return this;
        }

        public ProductBuilder discount(int discount) {
            this.discount = discount;
            return this;
        }

        public ProductBuilder addedDate(LocalDate addedDate) {
            this.addedDate = addedDate;
            return this;
        }

        public ProductBuilder id(UUID id) {
            this.id = id;
            return this;
        }

        public Product build() {
            return new Product(type, price, discount, addedDate, id);
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public LocalDate getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(LocalDate addedDate) {
        this.addedDate = addedDate;
    }

    public UUID getId() {
        return id;
    }
}
