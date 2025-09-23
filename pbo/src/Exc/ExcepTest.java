/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exc;

/**
 *
 * @author Ali Rohmat
 */
public class ExcepTest {
    public static void main(String[] args) {
        try{
            int a[] = new int[2];
            System.out.println("Acces element three :" + a[3]);
            
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception Throw : " +e);
        }
        System.out.println("Out of The Block");
    }
}
