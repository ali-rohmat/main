/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_No6;

/**
 *
 * @author Ali Rohmat
 */
class Majalah extends ItemPerpustakaan {
    int edisi, volume;
    Majalah(String judul, int tahun, int edisi, int volume) {
        super(judul, tahun);
        this.edisi = edisi;
        this.volume = volume;
    }

    @Override
    void tampilkanInfo() {
        System.out.println("Majalah: " + judul + ", Edisi: " + edisi + ", Volume: " + volume);
    }
}