package Algorithms_and_data_structures.Ecommerce_platform_search_function;

import java.util.*;

public class EcommerceSearch {

    public static List<Product> searchProducts(List<Product> catalog, String keyword, double minPrice,
            double maxPrice) {
        List<Product> results = new ArrayList<>();
        keyword = keyword.toLowerCase();

        for (Product product : catalog) {
            if ((product.getName().contains(keyword) || product.getCategory().contains(keyword))
                    && product.getPrice() >= minPrice
                    && product.getPrice() <= maxPrice) {
                results.add(product);
            }
        }

        // Sort by price ascending
        results.sort(Comparator.comparing(Product::getPrice));
        return results;
    }

    public static void main(String[] args) {
        List<Product> catalog = new ArrayList<>();
        catalog.add(new Product(1, "iPhone 14", "Electronics", 999.99));
        catalog.add(new Product(2, "Samsung Galaxy S22", "Electronics", 899.99));
        catalog.add(new Product(3, "Nike Running Shoes", "Footwear", 149.99));
        catalog.add(new Product(4, "Levi's Jeans", "Clothing", 59.99));
        catalog.add(new Product(5, "Sony Headphones", "Electronics", 199.99));

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter search keyword: ");
        String keyword = scanner.nextLine();

        System.out.print("Enter minimum price: ");
        double minPrice = scanner.nextDouble();

        System.out.print("Enter maximum price: ");
        double maxPrice = scanner.nextDouble();

        List<Product> searchResults = searchProducts(catalog, keyword, minPrice, maxPrice);

        if (searchResults.isEmpty()) {
            System.out.println("No products found matching your criteria.");
        } else {
            System.out.println("Search Results:");
            for (Product p : searchResults) {
                System.out.println(p);
            }
        }

        scanner.close();
    }
}