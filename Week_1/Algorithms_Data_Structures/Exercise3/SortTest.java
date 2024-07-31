package Exercise3;

import java.util.Arrays;

public class SortTest {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("1", "John Doe", 250.0),
            new Order("2", "Jane Smith", 450.0),
            new Order("3", "Mike Johnson", 100.0),
            new Order("4", "Emily Davis", 150.0),
            new Order("5", "Chris Brown", 300.0)
        };

        // Test Bubble Sort
        Order[] bubbleSortedOrders = Arrays.copyOf(orders, orders.length);
        BubbleSort.bubbleSort(bubbleSortedOrders);
        System.out.println("Bubble Sorted Orders:");
        for (Order order : bubbleSortedOrders) {
            System.out.println(order.getOrderId() + ": " + order.getCustomerName() + " - $" + order.getTotalPrice());
        }

        // Test Quick Sort
        Order[] quickSortedOrders = Arrays.copyOf(orders, orders.length);
        QuickSort.quickSort(quickSortedOrders, 0, quickSortedOrders.length - 1);
        System.out.println("\nQuick Sorted Orders:");
        for (Order order : quickSortedOrders) {
            System.out.println(order.getOrderId() + ": " + order.getCustomerName() + " - $" + order.getTotalPrice());
        }
    }
}
