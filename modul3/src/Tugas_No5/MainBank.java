/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_No5;

/**
 *
 * @author Ali Rohmat
 */
import java.util.Scanner;

public class MainBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pilih jenis rekening:");
        System.out.println("1. Tabungan");
        System.out.println("2. Giro");
        System.out.println("3. Deposito");
        int pilih = sc.nextInt();

        Rekening rek;
        if (pilih == 1) {
            rek = new RekeningTabungan("001", 1000000);
        } else if (pilih == 2) {
            rek = new RekeningGiro("002", 500000);
        } else {
            rek = new RekeningDeposito("003", 2000000);
        }

        // contoh setoran
        System.out.print("Masukkan jumlah setor: ");
        double setor = sc.nextDouble();
        rek.setor(setor);

        // contoh penarikan
        System.out.print("Masukkan jumlah tarik: ");
        double tarik = sc.nextDouble();
        rek.tarik(tarik);
    }
}
