/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_No5;

/**
 *
 * @author Ali Rohmat
 */
class RekeningDeposito extends Rekening {
    RekeningDeposito(String noRek, double saldo) { super(noRek, saldo); }
    void tarik(double jumlah) {
        System.out.println("Tidak bisa tarik sebelum jatuh tempo.");
    }
}
