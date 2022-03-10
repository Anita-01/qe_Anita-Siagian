/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal2;

/**
 *
 * @author ACER
 */
public class Kubus {
    int ku;
    int volume;
    
    public int volku(){
        return ku*ku*ku;
    }
    public void volkubus(){
        System.out.println("Kubus:" + volku());
    }
    
}
