/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudiKasus;

/**
 *
 * @author Ali Rohmat
 */
public class RunCase {
    public static void main(String[] args) {
        // Buat user
        Student s = new Student("stu01", "12345");
        Librarian l = new Librarian("lib01", "abcde");

        // Buat material
        Book b = new Book("Java Programming");
        Journal j = new Journal("AI Research Journal");

        // Buat library & agregasi data
        Library lib = new Library();
        lib.addUser(s);
        lib.addUser(l);
        lib.addMaterial(b);
        lib.addMaterial(j);

        // Tampilkan koleksi
        lib.showMaterials();

        // Transaksi pinjam
        BorrowTransaction t = new BorrowTransaction(s, b, "2025-09-15");
        t.showTransaction();
    }
}