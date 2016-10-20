/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.number.bigdecimal;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class BigDecimalMoney {

    public static void main(String[] args) {
        BigDecimal money1 = new BigDecimal("100.26");
        BigDecimal money2 = new BigDecimal("57.75");
        
        BigDecimal hasil = money1.add(money2);
        
        System.out.println("Dollar : " + formatUang(hasil.doubleValue(), Locale.US));
        System.out.println("Jepang : " + formatUang(hasil.doubleValue(), Locale.JAPAN));
        System.out.println("Francis : " + formatUang(hasil.doubleValue(), Locale.FRANCE));
        System.out.println("Indonesia : " + formatUang(hasil.doubleValue(), new Locale("id", "ID")));
    }
    
    private static String formatUang(double value, Locale locale) {
        NumberFormat format = NumberFormat.getCurrencyInstance(locale);
        return format.format(value);
    }
    
}
