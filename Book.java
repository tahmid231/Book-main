/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.book;

public class Book {

    static String genre = "Fiction";


    private String title;
    private String author;
    private int year;


    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        Book.bookCount++;
    }


    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("Genre: " + genre);
        System.out.println();
    }


    private static int bookCount = 0;
    public static void displayBookCount() {
        System.out.println("Total Number of Books: " + bookCount);
    }

    public static void main(String[] args) {

        Book book1 = new Book("Aaj Robibar", "Humayun Ahmed", 1996);
        Book book2 = new Book("Harry Potter", "J. K. Rowling", 2007);
        Book book3 = new Book("It ends with us", "Colleen Hoover", 2016);


        book1.displayBookDetails();
        book2.displayBookDetails();
        book3.displayBookDetails();

  
        Book.displayBookCount();
    }
}
