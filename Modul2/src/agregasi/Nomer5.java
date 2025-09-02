/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agregasi;

/**
 *
 * @author Ali Rohmat
 */
import java.util.*;

class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
}

class Library {
    private List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public void showBooks() {
        System.out.println("Library contains:");
        for (Book b : books) {
            System.out.println("- " + b.getTitle());
        }
    }
}


