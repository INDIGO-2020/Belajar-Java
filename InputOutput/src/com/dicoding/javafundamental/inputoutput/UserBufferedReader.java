/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicoding.javafundamental.inputoutput;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author AnggaAF
 */
public class UserBufferedReader {
static public void main (String[]args){
    InputStreamReader sr=new InputStreamReader(System.in);
    BufferedReader r=new BufferedReader(sr);
    System.out.println("Penjumlahan Sederhana");
    int nilai1 = 0;
    int nilai2 = 0;
    
    try{
        System.out.print("Masukkan Nilai Pertama ");
        nilai1 = Integer.parseInt(r.readLine());
        System.out.printf("Masukkan Nilai kedua");
        nilai2 = Integer.parseInt(r.readLine());
    }catch(IOException e){
        e.printStackTrace();
    }
    int result = nilai1 + nilai2;
    System.out.print("Hasilnya " + result);
}    
}
