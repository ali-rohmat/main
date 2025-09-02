/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agregasi;

import static java.lang.System.out;

/**
 *
 * @author Ali Rohmat
 */
public class studentRun {
    public static void main(String[] args) {
    Address ad = new Address (10, "Bareilly", "UP", "India");
    student st = new student(1, "Aashi", ad);
    System.out.println("Roll no" + st.no);
    System.out.println("Name " + st.stName);
    System.out.println("Street: " + st.staddr.strium); 
    System.out.println("City: " + st.staddr.city);
    System.out.println("State " + st.staddr.state);
    System.out.println("Country: " +st.staddr.country);
    }
}
