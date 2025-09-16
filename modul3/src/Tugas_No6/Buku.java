/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_No6;

/**
 *
 * @author Ali Rohmat
 */
class Buku extends ItemPerpustakaan {
    String pengarang;
    int halaman;

    Buku(String judul, int tahun, String pengarang, int halaman) {
        super(judul, tahun);
        this.pengarang = pengarang;
        this.halaman = halaman;
    }

    @Override
    void tampilkanInfo() {
        System.out.println("Buku: " + judul + ", Pengarang: " + pengarang + ", Halaman: " + halaman);
    }
}