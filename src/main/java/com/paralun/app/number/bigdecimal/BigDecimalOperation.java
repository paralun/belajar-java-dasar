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
        
        BigDecimal tambah = bil1.add(bil2);
        System.out.println("Tambah : " + tambah.toString());
        
        BigDecimal kali = bil1.multiply(bil2);
        System.out.println("Kali : " + kali.toString());
        
        BigDecimal kurang = bil1.subtract(bil2);
        System.out.println("Kurang : " + kurang.toString());
        
        BigDecimal bagi = bil1.divide(bil2, RoundingMode.HALF_UP);
        System.out.println("Bagi : " + bagi);
        
        BigDecimal pangkat = bil1.pow(2);
        System.out.println("Pangkat : " + pangkat.toString());
        
        BigDecimal negatif = bil1.negate();
        System.out.println("Negatif : " + negatif.toString());
    }
}
