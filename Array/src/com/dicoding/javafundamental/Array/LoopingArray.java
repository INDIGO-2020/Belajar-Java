/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicoding.javafundamental.Array;

/**
 *
 * @author AnggaAF
 */
public class LoopingArray {
    public static void main (String[]args) throws Exception {
        int[] arrInt= new int[1000000];
        
        //inisialisasi akan menampilkan perluangan 1 - 1juta
        for(int i=0; i< arrInt.length; i++){
            arrInt[i]= i +1;
            System.out.print(arrInt[i]);
        }
    }
}
