/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agregasi;

/**
 *
 * @author Ali Rohmat
 */
class KomponenMobil {
    String namakomponen;
    public KomponenMobil(String namakomponen) {
        this.namakomponen = namakomponen;
    }   
    public void tampilkanInfo() {
        System.out.println("Komponen:" + namakomponen);
    }
}
// Subclass Mesin yang mewarisi KomponenMobil
class Mesin extends KomponenMobil {
    public Mesin(String namaMesin) {
        super (namaMesin);
    }
    public void nyalakanMesin() {
    System.out.println(namakomponen +" dinyalakan.");
    }
}
// Subclass Baterai yang mewarisi KomponenMobil
class Baterai extends KomponenMobil {
    public Baterai (String namaBaterai) { 
        super (namaBaterai);
    }
    public void cekBaterai() {
        System.out.println(namakomponen +" diperiksa.");
    }
}
