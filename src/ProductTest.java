import java.util.Scanner;

// Product class
class Product {
    private int id;
    private String name;
    private double price;

    // Constructor
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Method to display product details
    public void displayDetails() {
        System.out.println("\nProduct Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}

// Main class
public class ProductTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input product details
        System.out.print("Product ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Price: ");
        double price = scanner.nextDouble();

        // Create product object and display details
        Product product = new Product(id, name, price);
        product.displayDetails();

        scanner.close();
    }
}
