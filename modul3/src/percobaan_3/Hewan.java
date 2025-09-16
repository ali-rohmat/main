/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaan_3;

/**
 *
 * @author Ali Rohmat
 */
import java.util.Scanner;
//Kelas abstrak Hewan
abstract class Hewan {
    public abstract void suara();
    public void tidur() {
        System.out.println("Hawan sedang tidur");
    }
}
// Kelas turunan Anjing
class Anjing extends Hewan {
    public void suara() {
        System.out.println("Anjing menggonggong");
    }
}

// kelas turunan Kucing class Kucing extends Hewan
class Kucing extends Hewan {
    public void suara() {
        System.out.println("Anjing menggonggong");
    }
}
