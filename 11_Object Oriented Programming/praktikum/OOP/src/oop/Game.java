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
public class Game {
    public static void main(String[] args){
        Player player = new Player();
        
        player.name = "adi";
        player.speed = 70;
        player.healthPoint = 100;
        
        player.run();
        if (player.isDead()){
            System.out.println("Game Over!!!");
        }
        
    }
}
