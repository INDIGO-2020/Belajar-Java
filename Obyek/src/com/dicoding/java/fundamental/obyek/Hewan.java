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
public class Hewan {
    String nama;
    int berat;
    int jumlahkaki;
    
    //ini adalah konstruktor dari kelas Hewan.
    /*konstruktor adalah method yang pertama kali dijalankan ketika object 
    diciptakan*/
    public Hewan(String namaHewan){
        nama = namaHewan;
    }
    public void beratHewan(int beratHewan){
        berat = beratHewan;
    }
    public void jumlahKakiHewan(int jumlahKakiHewan){
        jumlahkaki = jumlahKakiHewan;
    }
    public void cetakHewan(){
        System.out.println("Nama Hewan : " + nama);
        System.out.println("Berat Hewan : " + berat);
        System.out.println("Jumlah Kaki Hewan : " + jumlahkaki);
    }
}
