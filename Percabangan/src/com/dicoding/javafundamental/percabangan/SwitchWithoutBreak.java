/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicoding.javafundamental.percabangan;

/**
 *
 * @author AnggaAF
 */
public class SwitchWithoutBreak {
    public static void main(String[]args){
    int nilai=30;
    char input='C';
    
    switch(input){
    case 'A':
    nilai++;
    case 'B':
    nilai++;
    case 'C':
    nilai++;
    case 'D':
    nilai++;
    default:
    nilai++;
    }
    System.out.println("Nilai Akhir anda " +nilai);
 }
}
