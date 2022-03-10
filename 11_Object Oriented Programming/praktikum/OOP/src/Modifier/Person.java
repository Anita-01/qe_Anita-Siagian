/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modifier;

/**
 *
 * @author ACER
 */
public class Person {
    public static String name;
  protected static int umur;
  
    
    
    public static String changeName(String newName){
        name = newName;
        return newName;
    }
    public void getUmur() {
        umur = 10;
    }
  
}
