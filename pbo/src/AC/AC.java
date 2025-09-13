/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AC;

/**
 *
 * @author Ali Rohmat
 */
public class AC implements InterfaceAC{
    int AC_status;
    
    

    @Override
    public void hidupkan() {
        if(AC_status == AC_MATI || AC_status == AC_HOT || AC_status == AC_COOL){
            AC_status = AC_HIDUP;
            System.out.println("AC Dinyalakan --> AC NYALA");
        }else{
            System.out.println("AC Dinyalakan --> AC Sudah nyala");
        }
    }

    @Override
    public void matikan() {
        if(AC_status == AC_HIDUP){
            AC_status = AC_MATI;
            System.out.println("AC Dimatikan --> AC Mati");
        }else{
            System.out.println("AC Dimatikan --> AC Sudah Mati");
        }
    }

    @Override
    public void panaskan() {
        if(AC_status == AC_HIDUP || AC_status == AC_COOL){
            AC_status = AC_HOT;
            System.out.println("AC Dipanaskan --> AC panas");
        }else{
            System.out.println("AC Dipanaskan --> AC Dalam kondisi Mati");
        }
    }

    @Override
    public void dinginkan() {
        if(AC_status == AC_HIDUP || AC_status == AC_HOT){
            AC_status = AC_COOL;
            System.out.println("AC Didinginkan --> AC Dingin");
        }else{
            System.out.println("AC Didinginkan --> AC Dalam kondisi Mati");
        }
    }
    
}
