/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agregasi;

/**
 *
 * @author Ali Rohmat
 */
public class VehicleRun {
    public static void main(String[] args) {
        Speed speed = new Speed();
        Van van = new Van();
        speed.setMax(120);
        
        van.setvin("abcd1233");
        van.setSpeed(speed);
        van.print();
        
    }
}
