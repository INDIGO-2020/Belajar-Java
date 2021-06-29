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
public class KelasB extends KelasA {
    @Override
    protected void functionC(){
        super.functionC();
        
        System.out.println("Percobaan protected diluar kelas/paket");
    }
}
