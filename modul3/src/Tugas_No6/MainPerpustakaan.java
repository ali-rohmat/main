/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_No6;

/**
 *
 * @author Ali Rohmat
 */
import java.util.ArrayList;
import java.util.Scanner;

public class MainPerpustakaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ItemPerpustakaan> koleksi = new ArrayList<>();

        System.out.println("Berapa item yang ingin dimasukkan?");
        int n = sc.nextInt();
        sc.nextLine(); // buang newline

        for (int i = 0; i < n; i++) {
            System.out.println("\nPilih jenis item:");
            System.out.println("1. Buku");
            System.out.println("2. Majalah");
            System.out.println("3. DVD");
            int pilih = sc.nextInt();
            sc.nextLine(); // buang newline

            System.out.print("Judul: ");
            String judul = sc.nextLine();
            System.out.print("Tahun terbit: ");
            int tahun = sc.nextInt();
            sc.nextLine();

            if (pilih == 1) {
                System.out.print("Pengarang: ");
                String pengarang = sc.nextLine();
                System.out.print("Jumlah halaman: ");
                int halaman = sc.nextInt();
                koleksi.add(new Buku(judul, tahun, pengarang, halaman));
            } else if (pilih == 2) {
                System.out.print("Edisi: ");
                int edisi = sc.nextInt();
                System.out.print("Volume: ");
                int volume = sc.nextInt();
                koleksi.add(new Majalah(judul, tahun, edisi, volume));
            } else {
                System.out.print("Durasi (menit): ");
                int durasi = sc.nextInt();
                sc.nextLine();
                System.out.print("Genre: ");
                String genre = sc.nextLine();
                koleksi.add(new DVD(judul, tahun, durasi, genre));
            }
        }

        System.out.println("\nDaftar Koleksi Perpustakaan:");
        for (ItemPerpustakaan item : koleksi) {
            item.tampilkanInfo();
        }
    }
}

