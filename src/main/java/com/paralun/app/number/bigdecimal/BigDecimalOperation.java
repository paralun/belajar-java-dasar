/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.number.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalOperation {

    public static void main(String[] args) {
        
        BigDecimal bil1 = new BigDecimal("123456789");
        BigDecimal bil2 = new BigDecimal("456778");
        
        BigDecimal bil3 = new BigDecimal("12345");
        BigDecimal bil4 = new BigDecimal("-12345");
        
        
        BigDecimal tambah = bil1.add(bil2);
        System.out.println("Tambah : " + tambah.toString());
        
        BigDecimal kali = bil1.multiply(bil2);
        System.out.println("Kali : " + kali.toString());
        
        BigDecimal kurang = bil1.subtract(bil2);
        System.out.println("Kurang : " + kurang.toString());
        
        BigDecimal bagi = bil1.divide(bil2, RoundingMode.HALF_UP);
        System.out.println("Bagi : " + bagi);
        
        BigDecimal bagi2 = bil1.divide(bil2, 3, RoundingMode.HALF_UP);
        System.out.println("Bagi2 : " + bagi2);
        
        BigDecimal pangkat = bil1.pow(2);
        System.out.println("Pangkat : " + pangkat.toString());
        
        BigDecimal negatif1 = bil3.negate();
        BigDecimal negatif2 = bil4.negate();
        System.out.println(bil3 + "--> " + negatif1.toString());
        System.out.println(bil4 + "--> " + negatif2.toString());
        
        BigDecimal plus1 = bil3.plus();
        BigDecimal plus2 = bil4.plus();
        System.out.println(bil3 + "--> " + plus1.toString());
        System.out.println(bil4 + "--> " + plus2.toString());
        
    }
}
