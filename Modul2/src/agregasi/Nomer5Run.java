/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agregasi;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ali Rohmat
 */
public class Nomer5Run {
    public static void main(String[] args) {
        Book b1 = new Book("Clean Code");
        Book b2 = new Book("Effective Java");
        Book b3 = new Book("Design Patterns");

        List<Book> list = new ArrayList<>();
        list.add(b1);
        list.add(b2);
        list.add(b3);

        Library lib = new Library(list);
        lib.showBooks();
    }
  
}
