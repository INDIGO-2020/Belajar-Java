/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicoding.javafundamental.propertimethod;

/**
 *
 * @author AnggaAF
 */
public class Hewan {
    
    //properti dari class hewan
    double tinggi = 15; //inisialisasi dengan nilai awal
    double berat =8;    //inisialisasi dengan nilai awal(2)
    int umur;   //inisialisasi melalui konstruktor
    String nama;
    //konstruktor dengan parameter
    Hewan(int umur){
        this.umur = umur; //kode 'this' adalah untuk mereferensikan obejek
                            //yang akan digunakan. lebih praktisnya untuk
    }                        // menentukan kedudukan variabel yang akan dipakai.
    Hewan(String nama){
     this.nama = nama;   
    }
    void lari(){
        System.out.println("Berlari dengan kaki");
    }
    void makan(){
        System.out.println("Memakan dedaunan");
    }
    
    //method dengan nilai return
    double getBerat(){
        return berat;
    }
    double getTinggi(){
        return tinggi;
    }
    int getUmur(){
        return umur;
    }
    String getNama(){
        System.out.println("Namanya adalah Jerapah");
        return nama;
    }
}
