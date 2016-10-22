/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.number.bigdecimal;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigDecimalRemainder {

    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal("700.558");
        MathContext mc = new MathContext(2, RoundingMode.CEILING);
        BigDecimal bd2 = bd1.remainder(new BigDecimal("21.46"), mc);
        System.out.println("a % b : " + bd2);
        
        BigDecimal[] bd3 = bd1.divideAndRemainder(new BigDecimal("21.46"), mc);
        System.out.println("a/b : " + bd3[0]);
        System.out.println("a%b : " + bd3[1]);
    }
    
}
