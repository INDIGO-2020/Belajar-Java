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
public class MutipleDimensionalArray {
    public static void main (String[]args) throws Exception{
        char[][] arrChar= new char[2][];
        arrChar[0]=new char[2];
        arrChar[1]=new char[3];
        
        //dimensi 1 indexnya dimulai dari 0 memiliki panjang elemen 2
        arrChar[0][0]= 'A';
        arrChar[0][1]= 'B';
        
        //dimensi 2 indexnya dimulai dari 1 memiliki panjang elemen 3
        arrChar[1][0]='C';
        arrChar[1][1]='D';
        arrChar[1][2]='E';
        
        System.out.println("Dimensi 1 dengan index 0 dan Dimensi 2 dengan index 0 adalah " + arrChar[0][0]);
        System.out.println("Dimensi 1 dengan index 0 dan Dimensi 2 dengan index 1 adalah " + arrChar[0][1]);
        
        System.out.println("Dimensi 1 dengan index 1 dan Dimensi 2 dengan index 0 adalah " + arrChar[1][0]);
        System.out.println("Dimensi 1 dengan index 1 dan Dimensi 2 dengan index 1 adalah " + arrChar[1][1]);
        System.out.println("Dimensi 1 dengan index 1 dan Dimensi 2 dengan index 2 adalah " + arrChar[1][2]);
        
    }
}
