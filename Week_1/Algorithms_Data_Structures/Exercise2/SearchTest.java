package Exercise2;

public class SearchTest {
    public static void main(String[] args) {
        Product[] products = {
            new Product("1", "Laptop", "Electronics"),
            new Product("2", "Phone", "Electronics"),
            new Product("3", "Shirt", "Clothing"),
            new Product("4", "Book", "Books"),
            new Product("5", "Shoes", "Footwear")
        };

        // Test linear search
        Product product = LinearSearch.linearSearch(products, "3");
        if (product != null) {
            System.out.println("Linear Search: Found product - " + product.getProductName());
        } else {
            System.out.println("Linear Search: Product not found.");
        }

        // Test binary search
        product = BinarySearch.binarySearch(products, "3");
        if (product != null) {
            System.out.println("Binary Search: Found product - " + product.getProductName());
        } else {
            System.out.println("Binary Search: Product not found.");
        }
    }
}
