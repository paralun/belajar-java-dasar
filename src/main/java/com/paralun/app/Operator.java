/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app;

public class Operator {

    public static void main(String[] args) {
         // Operator Aritmatika
         int a = 10;
         int b = 20;
         float c = 30f;
         float d = 5f;
         
         int penjumlahan = a + b;
         int pengurangan = b - a;
         int perkalian = a * b;
         float pembagian = c / d;
         
         System.out.println("a + b : " + penjumlahan);
         System.out.println("b - a : " + pengurangan);
         System.out.println("a x b : " + perkalian);
         System.out.println("c / d : " + pembagian);
         System.out.println("Increment(++) a : " + (a++));
         System.out.println("Decrement(--) b : " + (b--));
         
         System.out.println("==========================");
         
         //Operator Penugasan
         penjumlahan += 20;
         pengurangan -= 5;
         perkalian *= 2;
         pembagian /= 2f;
         
         System.out.println(penjumlahan);
         System.out.println(pengurangan);
         System.out.println(perkalian);
         System.out.println(pembagian);
         
         System.out.println("==========================");
         
         //Operator Pembanding
         System.out.println("2 == 4 : " + (2 == 4));
         System.out.println("2 != 2 : " + (2 != 2));
         System.out.println("4 >= 8 : " + (4 >= 8));
         System.out.println("8 <= 9 : " + (8 <= 9));
         System.out.println("4 > 4 : " + (4 > 4));
         System.out.println("8 < 7 : " + (8 < 7));
         
         System.out.println("==========================");
         
         //Operator Logika
         System.out.println("Operator Logika &&");
         System.out.println("False && False : " + (false && false));
         System.out.println("False && True : " + (false && true));
         System.out.println("True && False : " + (true && false));
         System.out.println("True && True : " + (true && true));
         
         System.out.println("Operator Logika ||");
         System.out.println("False || False : " + (false || false));
         System.out.println("False || True : " + (false || true));
         System.out.println("True || False : " + (true || false));
         System.out.println("True || True : " + (true || true));
         
    }
}
