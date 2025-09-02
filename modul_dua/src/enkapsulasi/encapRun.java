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
        Encap encap = new Encap();
        encap.setName("James");
        encap.setAge(20);
        encap.setIdNum("12343ms");
        System.out.print("Name: "+ encap.getName() +" Age: "+ encap.getAge());
     }
}   
