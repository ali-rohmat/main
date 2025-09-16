/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_No6;

/**
 *
 * @author Ali Rohmat
 */
class DVD extends ItemPerpustakaan {
    int durasi;
    String genre;
    DVD(String judul, int tahun, int durasi, String genre) {
        super(judul, tahun);
        this.durasi = durasi;
        this.genre = genre;
    }

    @Override
    void tampilkanInfo() {
        System.out.println("DVD: " + judul + ", Durasi: " + durasi + " menit, Genre: " + genre);
    }
}
