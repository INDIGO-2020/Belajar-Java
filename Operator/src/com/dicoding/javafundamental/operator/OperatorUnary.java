/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicoding.javafundamental.operator;

/**
 *
 * @author AnggaAF
 */

public class OperatorUnary {
    public static void main(String[]args){
        int i,i2,i3,i4,i5;
        System.out.println("Operator Unary plus");
        i= 5;
        int hasil = +i;
        System.out.print("Hasil +5 = " + hasil);
        System.out.println();
        
        System.out.println("Operator Unary min");
        i2= 5;
        i2 = -i2;
        System.out.print("Hasil -5 = " + i2);
        System.out.println();
        
        System.out.println("Operator Unary nilai ++");
        i3= 5;
        i3++;
        System.out.print("Hasil 5++ = " + i3);
        System.out.println();
        
        System.out.println("Operator Unary nilai --");
        i4= 5; --i4;
        System.out.print("Hasil 5++ = " + i4);
        System.out.println();
        
        System.out.println("Operator komplemen logika");
        boolean sukses = false;
        System.out.println("Hasil !false adalah " + !sukses);
    }
}
