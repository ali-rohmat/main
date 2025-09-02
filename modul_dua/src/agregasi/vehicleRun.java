/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agregasi;

/**
 *
 * @author Ali Rohmat
 */
public class vehicleRun {
    public static void main(String[] args) {
        Speed speed = new Speed();
        speed.setMax(120);
        Van van = new Van();
        van.setvin("abcd1233");
        van.setSpeed(speed);
        van.print();   
    }
}
