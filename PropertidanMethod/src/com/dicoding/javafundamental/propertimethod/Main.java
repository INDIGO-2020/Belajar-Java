/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicoding.javafundamental.propertimethod;

/**
 *
 * @author AnggaAF
 */
public class Main {
    public static void main(String[]args){
        System.out.println("Berikut kelakun hewan : ");
        Hewan jerapah = new Hewan(2); //parameter tersebut untuk menambahkan nilai-
        jerapah.lari();                 //pada konstruktor Hewan/variabel umur
        jerapah.makan();
        
    //contoh fungsi penggunaan getUmur();
    System.out.println("Umur hewan : " + jerapah.getUmur());
    
    /*pErhitungan index massa umur(bmi)
    */
    double bmi = jerapah.getBerat() / ((jerapah.getTinggi() / 0.01) * (jerapah.getTinggi() * 0.1));
    System.out.println("Index massa tubuhnya " + bmi);
    jerapah.getNama();
    }
    
}
