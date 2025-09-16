/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_No4;

/**
 *
 * @author Ali Rohmat
 */
import java.util.Scanner;

public class MainElektronik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pilih Alat Elektronik:");
        System.out.println("1. Televisi");
        System.out.println("2. Radio");
        int pilih = sc.nextInt();

        AlatElektronik alat;

        if (pilih == 1) {
            alat = new Televisi();
        } else {
            alat = new Radio();
        }

        alat.hidupkan();
        alat.matikan();
    }
}
