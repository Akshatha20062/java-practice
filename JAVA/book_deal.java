import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private double price;
    private int numberOfCopies;
    public Book(String title, String author, double price, int numberOfCopies) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.numberOfCopies = numberOfCopies;
    }
    public void displayBookDetails() {
        System.out.println("Book Title: " + this.title);
        System.out.println("Book Author: " + this.author);
        System.out.println("Book Price: " + this.price);
        System.out.println("Number of Copies: " + this.numberOfCopies);
        System.out.println();
    }
    public static Book getBookDetailsFromUser(Scanner scanner, int bookNumber) {
        System.out.println("Enter details for book " + bookNumber + ":");
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();
        System.out.print("Enter book price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter number of copies: ");
        int numberOfCopies = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.println();

        return new Book(title, author, price, numberOfCopies);
    }
}

    public class book_deal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[3];

        for (int i = 0; i < 3; i++) {
            books[i] = Book.getBookDetailsFromUser(scanner, i + 1);
        }

        System.out.println("Books in the inventory:");
        for (Book book : books) {
            book.displayBookDetails();
        }

        scanner.close();
    }
}
