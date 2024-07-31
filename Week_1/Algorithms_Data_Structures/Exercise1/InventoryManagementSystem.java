package Exercise1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InventoryManagementSystem {
    private Map<String, Product> inventory;

    public InventoryManagementSystem() {
        this.inventory = new HashMap<>();
    }

    // Add a product to the inventory
    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    // Update an existing product in the inventory
    public void updateProduct(String productId, int quantity, double price) {
        Product product = inventory.get(productId);
        if (product != null) {
            product.setQuantity(quantity);
            product.setPrice(price);
        } else {
            System.out.println("Product not found!");
        }
    }

    // Delete a product from the inventory
    public void deleteProduct(String productId) {
        inventory.remove(productId);
    }

    // Method to display all products
    public void displayProducts() {
        for (Product product : inventory.values()) {
            System.out.println("Product ID: " + product.getProductId());
            System.out.println("Product Name: " + product.getProductName());
            System.out.println("Quantity: " + product.getQuantity());
            System.out.println("Price: " + product.getPrice());
            System.out.println("------------------------");
        }
    }

    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option: ");
            System.out.println("1. Add a product");
            System.out.println("2. Update a product");
            System.out.println("3. Delete a product");
            System.out.println("4. Display all products");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter Product ID: ");
                    String addId = scanner.nextLine();
                    System.out.println("Enter Product Name: ");
                    String addName = scanner.nextLine();
                    System.out.println("Enter Quantity: ");
                    int addQuantity = scanner.nextInt();
                    System.out.println("Enter Price: ");
                    double addPrice = scanner.nextDouble();
                    ims.addProduct(new Product(addId, addName, addQuantity, addPrice));
                    break;
                case 2:
                    System.out.println("Enter Product ID: ");
                    String updateId = scanner.nextLine();
                    System.out.println("Enter New Quantity: ");
                    int updateQuantity = scanner.nextInt();
                    System.out.println("Enter New Price: ");
                    double updatePrice = scanner.nextDouble();
                    ims.updateProduct(updateId, updateQuantity, updatePrice);
                    break;
                case 3:
                    System.out.println("Enter Product ID: ");
                    String deleteId = scanner.nextLine();
                    ims.deleteProduct(deleteId);
                    break;
                case 4:
                    ims.displayProducts();
                    break;
                case 5:
                    scanner.close();
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please choose again.");
            }
        }
    }
}
