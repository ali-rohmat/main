/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_No5;

/**
 *
 * @author Ali Rohmat
 */
class RekeningTabungan extends Rekening {
    RekeningTabungan(String noRek, double saldo) { super(noRek, saldo); }
    void tarik(double jumlah) {
        if(saldo >= jumlah) saldo -= jumlah;
        else System.out.println("Saldo tidak cukup.");
        System.out.println("Saldo Tabungan: " + saldo);
    }
}
