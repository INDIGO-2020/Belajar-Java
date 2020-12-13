package com.dicoding.javafundamental.operator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AnggaAF
 */
public class OperatorConditional {
    public static void main(String[]args){
        int nilai1= 4;
        int nilai2= 5;
        boolean hasil,hasil2;
        
        System.out.println("Logika AND");
        hasil = nilai1 == 3 && nilai2 ==5;
        hasil2 = nilai1 != 3 && nilai2 ==5;
        System.out.print("Hasil dari nilai1==3 AND nilai2 ==5 adalah " +hasil);
        System.out.println();
        System.out.print("Hasil dari nilai1!=3 AND nilai2 ==5 adalah " +hasil2);
        System.out.println();
        System.out.println("Logika OR");
        
        hasil = nilai1 == 3 || nilai2 ==5;
        hasil2 = nilai2 != 3 || nilai2 ==5;
        System.out.print("Hasil dari nilai1 == 3 OR nilai2 ==5 adalah " +hasil);
        System.out.println();
        System.out.print("Hasil dari nilai1 != 3 OR nilai2 ==5 adalah " +hasil2);
        System.out.println();

    }
}
