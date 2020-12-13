package com.dicoding.javafundamental.percabangan;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AnggaAF
 */
public class IfThenElseIfThenElse {
    public static void main(String[]args){
        int na= 85;
        char Predikat;
        
        if(na >= 90){
            Predikat = 'A';
        }else if(na >=80){
            Predikat = 'B';
        }else if(na >= 70){
            Predikat = 'C';
        }else if(na >= 60){
            Predikat = 'D';
        }else{
            Predikat = 'E';
        }
        System.out.println("Predikat yang diperoleh adalah " + Predikat);
    }
}
