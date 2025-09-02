/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritence;

/**
 *
 * @author Ali Rohmat
 */
class Employee{
    float salary=40000;
}

public class programmer extends Employee{
int bonus = 10000;
    public static void main(String args[]){
    programmer p = new programmer();
        System.out.println("Programmer salary is: "+p.salary); System.out.println("Bonus of Programmer is: "+p.bonus);
    }
}