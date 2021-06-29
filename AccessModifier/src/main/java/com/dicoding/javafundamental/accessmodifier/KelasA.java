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
public class KelasA {
    private int memberA=5;  //access private tidak bisa dipanggil diluar paket yang berbeda
    String memberB="a";     //access default dapat dipanggil meskipun berbeda paket
    double memberC=1.4;
    private int functionA(){
        return memberA;
    }
    
    int functionB(){
        //pemanggilan private memberA dan private functionA
        int hasil = functionA() + memberA;
        return hasil;
    }
    protected void functionC(){
        System.out.println("Coba protected modifier");
    }
}

