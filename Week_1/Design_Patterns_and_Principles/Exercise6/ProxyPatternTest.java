package Exercise6;

public class ProxyPatternTest {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.png");

        // Display images
        System.out.println("First call to display image1:");
        image1.display(); // Loads and displays image1

        System.out.println("\nSecond call to display image1:");
        image1.display(); // Only displays image1

        System.out.println("\nFirst call to display image2:");
        image2.display(); // Loads and displays image2

        System.out.println("\nSecond call to display image2:");
        image2.display(); // Only displays image2
    }
}
