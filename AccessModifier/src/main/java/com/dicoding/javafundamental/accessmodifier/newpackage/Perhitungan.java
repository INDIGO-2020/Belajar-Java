/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicoding.javafundamental.accessmodifier.newpackage;

/**
 *
 * @author AnggaAF
 */
public class Perhitungan {
    public static int nilai=0;
    protected static int getNilai(){
        return nilai;
    }
    Perhitungan(){
        nilai++;
    }
}
