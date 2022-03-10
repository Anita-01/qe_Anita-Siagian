/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author ACER
 */
public class Player {
    String name;
    int speed;
    int healthPoint;
    
    void run(){
        System.out.println(name + " is runinggg...");
        System.out.println ("Speed " + speed);
    }
    
    boolean isDead(){
        if (healthPoint <= 0) return true;
        return false;
    }
    
}
