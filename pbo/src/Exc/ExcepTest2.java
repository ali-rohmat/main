/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exc;

/**
 *
 * @author Ali Rohmat
 */
public class ExcepTest2 {
    public static void main(String[] args) {
        try {
            int a[] = new int[2];
            try{
            int b = 0;
            int c = 1/b;
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("ArrayIndexOutOfBoundsException Throw : " + e);
            }
            System.out.println("Access element three : " + a[3]);
        } catch (Exception e) {
            System.out.println("Exception Throw : " + e);
        }
        System.out.println("out of the block");
    }
}
