/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_No2;

/**
 *
 * @author Ali Rohmat
 */
import percobaan_2.*;
import java.util.Scanner;
class Hewan{
    public void suara() {
        System.out.println("Hewan membuat suara");
    }
}
    class Anjing extends Hewan {
    @Override
        public void suara() {
            System.out.println("Anjing menggonggong");
        }
    }
    class Kucing extends Hewan {
    @Override
        public void suara() {
            System.out.println("Kucing mengeong");
        }
    }
    class Burung extends Hewan {
    @Override
        public void suara() {
            System.out.println("Cuit... cuit...");
        }
    }
