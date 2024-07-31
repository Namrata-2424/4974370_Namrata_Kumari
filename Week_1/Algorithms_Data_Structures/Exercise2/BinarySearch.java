package Exercise2;

import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {
    public static Product binarySearch(Product[] products, String productId) {
        Arrays.sort(products, Comparator.comparing(Product::getProductId));

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            Product midProduct = products[mid];

            if (midProduct.getProductId().equals(productId)) {
                return midProduct;
            } else if (midProduct.getProductId().compareTo(productId) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }
}
