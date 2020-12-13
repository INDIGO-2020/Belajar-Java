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
public class CallFunction {
    public static void main(String[]args){
        int c =sum(3,4);
           System.out.println(c);
        //memanggil fungsi
        CobaFungsi();
    }
    //return fungsi
    private static int sum(int a, int b){
        return a+b; 
    }
    public static void CobaFungsi(){
    System.out.println("Tampilan dari memanggil Fungsi");
    }

}
