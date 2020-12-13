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

//class tanpa konstruktor
class polos{
    String dataString;
    int dataInt;
}

// class dengan konstruktor
class Mahasiswa{
    String nama;
    String Jurusan;
    double IPK;
    /*ini adalah konstruktor untuk objek Mahasiswa yang nantinya akan dipanggil pertamakali
    saat objek dibuat*/
    public void Mahasiswa(String inputNama){
        nama=inputNama;
    }
    public void InputJurusan(String InputJurusan){
        Jurusan=InputJurusan;
    }
    public void InputIPK(double inputIPK){
        IPK= inputIPK;
    }
    
    public void cetakMahasiswa(){
        System.out.println("Nama anda adalah " + nama);
        System.out.println("Asal Jurusan " + Jurusan);
        System.out.println("IPK : " + IPK);
}
}
public class Main2 {
    public static void main (String[]args) throws Exception{
      /* polos objekPolos = new polos();
       objekPolos.dataString = "Hallo dunia";
       objekPolos.dataInt = 0;
       System.out.println(objekPolos.dataString);
       System.out.println(objekPolos.dataInt);
        
     */  
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "Angga";
        mahasiswa1.Jurusan = "Teknik Informatika";
        mahasiswa1.IPK = 4.00;
        
        mahasiswa1.cetakMahasiswa();
       
    }
}
