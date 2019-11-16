//Student Name: Jeremy Webb
//LSU ID: 89-893-8558
//Lab Section: 01
//Assignment: Book Store Project
//Submission Time: 2:05pm
package bookstoreproject;

import java.util.ArrayList;
import java.util.Collections;

public class BookStore {
    
    //Initialize Variables
    private String address;
    private String name;
    private ArrayList<Book> books = new ArrayList<>();
    
    //Create Constructor to initialize the address and name
    public BookStore(String address, String name)
    {
        this.address = address;
        this.name = name;
    }

    //Method to add books
    public void addBook(Book Books)
    {
        books.add(Books);
    }
    
    //Method to print out info nicely formatted
    public void listBooks()
    {
        System.out.printf("%-15s%-15s%-10s%-10s", "Title", "Author", "edition", "price");
        System.out.println();
        System.out.println("--------------------------------------------------");
    
        //Enhanced for loop
        for (Book b: books)
        {
            System.out.println(b.getInfo());
        }
        
        System.out.println("--------------------------------------------------");
        sortBooks();
    }

    //method for sorting the book info
    public void sortBooks()
    {
        Collections.sort(books);
    }
}