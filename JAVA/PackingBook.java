import library.books.Book;

public class  PackingBook{
    public static void main(String[] args) {
        Book myBook = new Book("Harry potter", "Rowling", 99.99);

        System.out.println("Title: " + myBook.getTitle());
        System.out.println("Author: " + myBook.getAuthor());
        System.out.println("Price: $" + myBook.getPrice());
    }
}