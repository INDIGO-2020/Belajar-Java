/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicoding.javafundamental.inputoutput;
import java.util.Scanner;
/**
 *
 * @author AnggaAF
 */
public class InputOutputFunction {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program Penjumlahan");
        System.out.print("Masukkan Angka : ");
        int nilai1 = scanner.nextInt();
        System.out.print("Masukkan Angka Lagi : ");
        int nilai2 = scanner.nextInt();
        int hasil = nilai1 + nilai2;
        System.out.println("Hasilnya : " + hasil);
    }
}
