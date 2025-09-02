/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agregasi;

/**
 *
 * @author Ali Rohmat
 */
public class MobilRun {
    public static void main(String[] args) {
         Mesin mesin = new Mesin("Mesin V8");
         Baterai baterai = new Baterai("Baterai Lithium-ion");
         
         Mobil mobil = new Mobil(mesin,baterai);
         
         mobil.mulaiJalan();
    }
}
