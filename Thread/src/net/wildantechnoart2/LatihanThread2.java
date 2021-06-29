/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wildantechnoart2;

import static java.lang.Thread.sleep;

/**
 *
 * @author anggaaf
 */

    

public class LatihanThread2 {
    Thread thread;
    int jumlah = 7;
    
    public static void main(String[]args){
        LatihanThread2 threadd = new LatihanThread2();
        threadd.proses_satu();
        threadd.proses_dua();
    }
    
    void proses_satu(){
       thread = new Thread(){
            public void run(){
                try{
                    for(int i=1; i<=jumlah; i++){
                        System.out.println("Nomor " + i);
                        sleep(1000);
                    }
                }catch(InterruptedException ex){
                    ex.printStackTrace();
                }
            }
        };
        thread.start();
    } 
          
    void proses_dua(){
       thread = new Thread(){
            public void run(){
                try{
                    for(int i=1; i<=jumlah; i++){
                        System.out.println("Hallo " + i);
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
