/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mtk;

import java.util.Scanner;

/**
 *
 * @author Ali Rohmat
 */
public class MatematikaBeraksi {
    
    public static void main(String[] args) {
        Matematika m = new Matematika();
        Scanner key = new Scanner(System.in);  // Create a Scanner object
        
        
        System.out.println("Aplikasi Matematika Sederhana");
        System.out.print("Masukkan nilai :");
        m.setNilai(key.nextInt());
        
    }
}
