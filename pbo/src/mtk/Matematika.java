/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mtk;

/**
 *
 * @author Ali Rohmat
 */
public class Matematika {
    private int nilai;
    
    public int getNilai(){
        return nilai;
    }
    
    public void setNilai(int n){
        nilai = n;
    }
    
    public void pertambahan(int a){
        nilai =+ a;
    }
    
    public void pengurangan(int b){
        nilai =- b;
    }
    
    public void perkalian(int c){
        nilai = nilai * c;
    }
    
    public void pembagian(int d){
        nilai = nilai / d;
    }

    
}
