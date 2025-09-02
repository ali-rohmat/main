/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

import java.util.Scanner;

/**
 *
 * @author Ali Rohmat
 */
public class BankBeraksi {
    public static void main(String[] args) {
        Bank b = new Bank();
        do {
        Scanner key = new Scanner(System.in);
        int p ; 
        System.out.println("Aplikasi Bank Sederhana");
        System.out.println("Saldo Anda " + b.CekSaldo());
        System.out.println("--------------------------");
            System.out.println("Daftar Menu");
            System.out.println("1. Tarik Uang");
            System.out.println("2. Simpan Uang");
            System.out.println("3. Cek Saldo");
            System.out.println("4. Selesai");
            System.out.print("Pilih Nomor Menu : ");
            p = key.nextInt();
            System.out.println("----------------------------");
            if (p == 1) {
                System.out.println("Jumlah Penarikan :");
                int s = key.nextInt();
                b.ambilUang(s);
            }
            else if (p == 2) {
                System.out.println("Jumlah Deposit :");
                int s = key.nextInt();
                b.simpanUang(s);
            }
            else if (p == 3) {
                System.out.println("Saldo Anda : " + b.CekSaldo());
            }
            else if (p == 4) {
                b.setC(1);
            }
            System.out.println("-------------------");
        }while(b.getC() == 1);
    }
}
