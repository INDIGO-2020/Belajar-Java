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
public class ReturnFunction {
    public static void main(String[]args) throws Exception{
        double p = 5;
        double l = 8;
        double hasil = hitungluas(p,l); //memanggil Fungsi hitungluas
        System.out.println("Hasilnya adalah " + hasil);
    }
    //fungsi dengan return
    static double hitungluas(double panjang,double lebar){
        double luas = panjang*lebar;
        return luas;
    }
}
