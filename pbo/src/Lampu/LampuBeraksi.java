/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lampu;

/**
 *
 * @author Ali Rohmat
 */
public class LampuBeraksi {
    public static void main(String[] args) {
        
        Lampu Lkamar = new Lampu();
        
        System.out.println("Status lampu saat ini : Mati");
        
        Lkamar.hidupkan();
        Lkamar.matikan();
        Lkamar.matikan();
        Lkamar.hidupkan();
        Lkamar.hidupkan();
    }
}
