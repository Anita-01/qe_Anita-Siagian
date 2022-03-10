/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal4;

/**
 *
 * @author ACER
 */
public class Barang {

    double length, wide, height, weight, divideVolume, divideWeight, money = 5000;

    public double volume() {
        return length * wide * height;
    }

    public double price() {
        return Math.max(divideVolume, divideWeight) * money;
    }
}

    
    

