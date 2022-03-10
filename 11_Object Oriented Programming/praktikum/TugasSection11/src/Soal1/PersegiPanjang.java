/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal1;

/**
 *
 * @author ACER
 */
public class PersegiPanjang {
    int a;
    int b;
    
    public int kelilingpersegipanjang(){
       return 2*a + 2*b;
     }
    
    public int luaspersegipanjang() {
        return a*b;
        
    }
    public void luasPP(){
        System.out.println("Persegi Panjang : " + luaspersegipanjang());
     }
    public void kelPP(){
        System.out.println("Persegi Panjang : " + kelilingpersegipanjang());
     }
}
