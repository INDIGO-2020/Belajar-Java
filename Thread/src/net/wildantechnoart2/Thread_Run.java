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
public class Thread_Run implements Runnable {
    int jumlah = 2;
    public static void main(String[]args){
        Thread_Run test=new Thread_Run();
    test.run();
    }
@Override
public void run(){
    try{
        for(int i=0; i<=jumlah; i++){
            System.out.println("ID "+ i);
            sleep(1000);
        }
    }catch(InterruptedException ex){
        ex.printStackTrace();
    }
    
}
}
