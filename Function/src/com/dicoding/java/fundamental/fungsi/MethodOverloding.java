/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicoding.java.fundamental.fungsi;

/**
 *
 * @author AnggaAF
 */
public class MethodOverloding {
    public static void main (String[]args){
        
        int hasil= hasilpersegi(10,12);
        System.out.println("Panjang persegi dengan tipe data Integer adalah " +hasil);
        //pemanggilan fungsi dengan nilai parameter
        double result = hasilpersegi(20,3);
        System.out.println("Panjang persegi dengan tipe data Double adalah " +result);
        
    }
    public static double hasilpersegi(double panjang, double lebar){
        double luas=panjang*lebar;
        return luas;
    }
    public static int hasilpersegi(int panjang, int lebar){
        int luas=panjang*lebar;
        return luas;
    }
}
