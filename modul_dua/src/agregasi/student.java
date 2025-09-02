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
int strium;
String city;
String state;
String country;
    Address(int street, String c, String st, String country) {
        this.city = c;
        this.strium = street;
        this.state = st;
        this.country = country;
    }
}

class student {
int no;
String stName;
Address staddr;
    student(int roll, String name, Address address) {
        this.no = roll;
        this.stName = name;
        this.staddr = address;
    }
}