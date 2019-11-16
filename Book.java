//Student Name: Jeremy Webb
//LSU ID: 89-893-8558
//Lab Section: 01
//Assignment: Book Store Project
//Submission Time: 2:05pm
package bookstoreproject;

public class Book implements Comparable<Book>{
    
    //Initialize Variables
    private String title;
    private String author;
    private int edition;
    private double price;
    
    //Create Constructor to initialize Book information
    public Book(String title, String author, int edition, double price)
    {
        this.title = title;
        this.author = author;
        this.edition = edition;
        this.price = price;
    }

    //Method to get the books info
    public String getInfo()
    {
        return String.format("%-15.10s%-15.10s%-10d%-10f", title, author, edition, price);
    }
    
    //Override the method to compare and sort
    @Override
    public int compareTo(Book other)
    {
     if (this.title.compareTo(other.title) > 0)
         return 1;
     else if(this.title.compareTo(other.title) < 0)
         return -1;
     else 
         return 0;
    }  
}
