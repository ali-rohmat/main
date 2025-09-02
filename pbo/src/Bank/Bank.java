/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

import java.util.Scanner;

/**
 *
 * @author Ali Rohmat
 */
public class Bank {
    protected int saldo;   
    int c;
    
    void setC(int c){
        this.c= c;
    }
    
    int CekSaldo(){
        return saldo;
    }
    int getC(){
        return c;
    }
    
    void ambilUang(int a){
        saldo =- a;
    }
    
    void simpanUang(int b){
        saldo =+ b;
    }
}
