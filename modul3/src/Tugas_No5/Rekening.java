/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_No5;

/**
 *
 * @author Ali Rohmat
 */
abstract class Rekening {
    String noRek;
    double saldo;

    Rekening(String noRek, double saldo) {
        this.noRek = noRek;
        this.saldo = saldo;
    }

    void setor(double jumlah) {
        saldo += jumlah;
        System.out.println("Setor: " + jumlah + " Saldo: " + saldo);
    }

    abstract void tarik(double jumlah);
}
