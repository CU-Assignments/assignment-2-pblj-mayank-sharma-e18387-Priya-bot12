import java.util.Scanner;

// Base class
class Book {
    protected String title;
    protected String author;
    protected double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

// Derived class: Fiction
class Fiction extends Book {
    public Fiction(String title, String author, double price) {
        super(title, author, price);
    }

    @Override
    public void displayDetails() {
        System.out.println("\nFiction Book Details:");
        super.displayDetails();
    }
}

// Derived class: Non-Fiction
class NonFiction extends Book {
    public NonFiction(String title, String author, double price) {
        super(title, author, price);
    }

    @Override
    public void displayDetails() {
        System.out.println("\nNon-Fiction Book Details:");
        super.displayDetails();
    }
}

// Main class
public class LibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Book 1: Fiction
        System.out.println("Enter details for Fiction Book:");
        System.out.print("Title: ");
        String fTitle = sc.nextLine();
        System.out.print("Author: ");
        String fAuthor = sc.nextLine();
        System.out.print("Price: ");
        double fPrice = sc.nextDouble();
        sc.nextLine(); // consume newline

        Fiction fictionBook = new Fiction(fTitle, fAuthor, fPrice);

        // Book 2: Non-Fiction
        System.out.println("\nEnter details for Non-Fiction Book:");
        System.out.print("Title: ");
        String nfTitle = sc.nextLine();
        System.out.print("Author: ");
        String nfAuthor = sc.nextLine();
        System.out.print("Price: ");
        double nfPrice = sc.nextDouble();

        NonFiction nonFictionBook = new NonFiction(nfTitle, nfAuthor, nfPrice);

        // Display
        fictionBook.displayDetails();
        nonFictionBook.displayDetails();

        sc.close();
    }
}
