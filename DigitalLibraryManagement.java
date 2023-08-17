
import java.util.HashMap;

import java.util.Map;

import java.util.Scanner;

 

class Book {

    private String title;

    private String author;

    private int year;

 

    public Book(String title, String author, int year) {

        this.title = title;

        this.author = author;

        this.year = year;

    }

 

    public String getTitle() {

        return title;

    }

 

    public String getAuthor() {

        return author;

    }

 

    public int getYear() {

        return year;

    }

}

 

class Library {

    private Map<String, Book> books;

 

    public Library() {

        books = new HashMap<>();

    }

 

    public void addBook(String id, Book book) {

        books.put(id, book);

    }

 

    public void removeBook(String id) {

        books.remove(id);

    }

 

    public void displayBooks() {

        for (Map.Entry<String, Book> entry : books.entrySet()) {

            String id = entry.getKey();

            Book book = entry.getValue();

            System.out.println("ID: " + id);

            System.out.println("Title: " + book.getTitle());

            System.out.println("Author: " + book.getAuthor());

            System.out.println("Year: " + book.getYear());

            System.out.println("-----------------------");

        }

    }

}

 

public class DigitalLibraryManagement {

    public static void main(String[] args) {

        Library library = new Library();

        Scanner scanner = new Scanner(System.in);

 

        while (true) {

            System.out.println("1. Add Book");

            System.out.println("2. Remove Book");

            System.out.println("3. Display Books");

            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            scanner.nextLine();

 

            switch (choice) {

                case 1:

                    System.out.print("Enter book ID: ");

                    String id = scanner.nextLine();

                    System.out.print("Enter book title: ");

                    String title = scanner.nextLine();

                    System.out.print("Enter book author: ");

                    String author = scanner.nextLine();

                    System.out.print("Enter book year: ");

                    int year = scanner.nextInt();

                    scanner.nextLine();

                    Book book = new Book(title, author, year);

                    library.addBook(id, book);

                    break;

                case 2:

                    System.out.print("Enter book ID: ");

                    id = scanner.nextLine();

                    library.removeBook(id);

                    break;

                case 3:

                    library.displayBooks();

                    break;

                case 4:

                    System.out.println("Exiting...");

                    System.exit(0);

                    break;

                default:

                    System.out.println("Invalid choice! Please try again.");

            }

        }

    }

}

 

 

 



 

