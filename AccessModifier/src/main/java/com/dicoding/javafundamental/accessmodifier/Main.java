/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicoding.javafundamental.accessmodifier;

/**
 *
 * @author AnggaAF
 */
public class Main {
    public static void main(String[]args){
        KelasA kelas = new KelasA();
        
        System.out.println(kelas.memberB);
        System.out.println(kelas.functionB());
        System.out.println(kelas.memberC);
        
        KelasB kelas1 = new KelasB();
        kelas1.functionC();
    }
}
