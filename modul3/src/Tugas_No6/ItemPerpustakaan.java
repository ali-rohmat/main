/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_No6;

/**
 *
 * @author Ali Rohmat
 */
class ItemPerpustakaan {
    String judul;
    int tahun;

    ItemPerpustakaan(String judul, int tahun) {
        this.judul = judul;
        this.tahun = tahun;
    }

    void tampilkanInfo() {
        System.out.println(judul + " (" + tahun + ")");
    }
}
