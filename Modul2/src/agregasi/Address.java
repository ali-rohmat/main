/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agregasi;

/**
 *
 * @author Ali Rohmat
 */
class Address {
    int strNum;
    String city;
    String state;
    String country;

    Address(int street, String c, String st, String country) {
    this.strNum = street; 
    this.city = c; 
    this.state = st;
    this.country = country;
    }
}
class Student {
    int rno;
    String stName;
    Address stAddr;
    
    Student(int roll, String name, Address address){
        this.rno = roll; 
        this.stName = name;
        this.stAddr = address;
    }
}
