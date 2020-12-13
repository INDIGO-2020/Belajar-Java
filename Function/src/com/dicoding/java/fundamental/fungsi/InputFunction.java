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
class panggilFungsi{
    int panjang;
    int lebar;
}
public class InputFunction {
    public static void main(String[]args){
        //memanggil fungsi
        persegi(2,3);
    }
    public static void persegi(int p,int l){
        double luas;
        luas = p*l;
        System.out.println("Hasil dari luas persegi " +luas);
    }
}
