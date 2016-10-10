/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.number.bigdecimal;

import java.math.BigDecimal;
import java.math.MathContext;

public class BigDecimalAdd {

    public static void main(String[] args) {
        BigDecimal bg1, bg2, bg3, bg4;
        
        bg1 = new BigDecimal("50.123");
        bg2 = new BigDecimal("40.13");
        
        bg3 = bg1.add(bg2);
        
        System.out.println(bg3);
        
        //MathContex
        MathContext mc = new MathContext(4);
        bg4 = bg1.add(bg2, mc);
        
        System.out.println(bg4);
    }
    
}
