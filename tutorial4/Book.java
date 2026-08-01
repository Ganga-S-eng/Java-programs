package tutorial4;
import java.util.Scanner;

public class Book {
    String title;
    String author;
    double price;

    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void display() {
        System.out.println("\nBook Details");
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : " + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book[] books = new Book[2];

        for (int i = 0; i < 2; i++) {
            System.out.println("Enter details for Book " + (i + 1));

            System.out.print("Title: ");
            String title = sc.nextLine();

            System.out.print("Author: ");
            String author = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine(); 

            books[i] = new Book(title, author, price);
        }

        System.out.println("\nBook Information:");
        for (Book book : books) {
            book.display();
        }

    }
}
