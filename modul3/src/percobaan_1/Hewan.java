/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaan_1;

/**
 *
 * @author Ali Rohmat
 */
import java.util.Scanner;

class Hewan {
    public void suara(){
        System.out.println("Hawan membuat suara");
    }
}
    class Anjing extends Hewan {
        @Override
        public void suara() {
        System.out.println("Anjing menggonggong");
        }
    }
    class Kucing extends Hewan{
        @Override
        public void suara() {
        System.out.println("Kucing mengeong");
        }
    }
