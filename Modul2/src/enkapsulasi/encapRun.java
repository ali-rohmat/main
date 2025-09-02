/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enkapsulasi;

/**
 *
 * @author Ali Rohmat
 */
public class encapRun {
    public static void main(String args[]) {
    encap e = new encap();
    e.setName("James");
    e.setAge(20);
    e.setIdNum("12343ms");
    System.out.print("Name: " + e.getName() + " Age: "+ e.getAge());
    }
}
