/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicoding.java.fundamental.obyek;

/**
 *
 * @author AnggaAF
 */
public class Main {
    public static void main (String[] args) throws Exception{
        Hewan Elang = new Hewan("Elang");
        Hewan Kucing = new Hewan("Kucing");
        
        Elang.beratHewan(13);
        Elang.jumlahKakiHewan(2);
        Elang.cetakHewan();
        
        Kucing.beratHewan(5);
        Kucing.jumlahKakiHewan(4);
        Kucing.cetakHewan();
    }
}
