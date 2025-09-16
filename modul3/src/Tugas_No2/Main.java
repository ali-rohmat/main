/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_No2;

import java.util.Scanner;

/**
 *
 * @author Ali Rohmat
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hewan[] hewanArray = new Hewan[3];
        hewanArray[0] = new Anjing();
        hewanArray[1] = new Kucing();
        hewanArray[2] = new Burung();
        System.out.println("Pilih hewan dari e hingga 2:");
        int pilihan = scanner.nextInt();
        if (pilihan >= 0 && pilihan == hewanArray.length) {
            hewanArray[pilihan].suara();
        } else {
            System.out.println("Pilihan tidak valid.");
        scanner.close();
        }
    }
}

