/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.decoding.javafundamental.basic;
import com.decoding.javafundamental.basic.musik.Gitar;
import com.dicoding.javafundamental.basic.kendaraan.Kereta;
import com.dicoding.javafundamental.basic.kendaraan.Mobil;
import com.dicoding.javafundamental.basic.kendaraan.Motor;
import java.util.Date;
import org.apache.commons.lang3.time.DateUtils;

/**
 *
 * @author AnggaAF
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main (String[] args){
        System.out.println("Hello World");
        Gitar.main(args);
        Mobil.main(args);
        Motor.main(args);
        Kereta.main(args);
    Date today = new Date();
    System.out.println("Hari ini = " + today);
    Date tomorrow = DateUtils.addDays(today, 1);
    System.out.println("Besok Hari " + tomorrow);
    }
}