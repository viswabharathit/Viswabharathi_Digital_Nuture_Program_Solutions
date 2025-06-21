package Algorithms_and_data_structures.Ecommerce_platform_search_function;

import java.util.*;

class Product {
    private int id;
    private String name;
    private String category;
    private double price;

    public Product(int id, String name, String category, double price) {
        this.id = id;
        this.name = name.toLowerCase();
        this.category = category.toLowerCase();
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ID=" + id +
                ", Name='" + name + '\'' +
                ", Category='" + category + '\'' +
                ", Price=$" + price +
                '}';
    }
}