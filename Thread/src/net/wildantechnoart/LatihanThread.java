/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wildantechnoart;

import static java.lang.Thread.sleep;

/**
 *
 * @author anggaaf
 */
       
public class LatihanThread {
    public static void main(String[]args){
        int jumlah=10;
        Thread thread;
        thread = new Thread(){
            public void run(){
                
                /**try-catch digunakan untuk menangkap jenis error
                 'InterruptedException' agar program tidak crash saat terjadi error**/
                try{
                    for(int i=1; i<=jumlah; i++){
                        System.out.println("Nomor : " + i);
                        sleep(1000);
                    }
                }catch(InterruptedException ex){
                    ex.printStackTrace();
                }
            }
        };
        thread.start();
}
}
        