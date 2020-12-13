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
public class OperatorEquality {
    public static void main(String[]args){
        int nilai1=5;
        int nilai2=4;
        boolean hasil;
        hasil = nilai1 == nilai2;
        System.out.println("nilai1 = 5");
        System.out.println("nilai2 = 4");
        System.out.print("Hasil nilai1 == nilai2 adalah " +hasil);
        System.out.println();
        
        hasil = nilai1 != nilai2;
        System.out.print("Hasil nilai1 != nilai2 adalah " +hasil);
        System.out.println();
        
        hasil = nilai1 > nilai2;
        System.out.print("Hasil nilai1 > nilai2 adalah " +hasil);
        System.out.println();
        
        hasil= nilai1 >=nilai2;
        System.out.print("Hasil nilai1 >= nilai2 adalah " +hasil);
        System.out.println();
        
        hasil = nilai1 < nilai2;
        System.out.print("Hasil nilai1 < nilai2 adalah " +hasil);
        System.out.println();
        
        hasil = nilai1 <= nilai2;
        System.out.print("Hasil nilai1 <= nilai2 adalah " +hasil);
        System.out.println();
    }
}
