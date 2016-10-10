/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.number.bigdecimal;

import java.math.BigDecimal;
import java.math.MathContext;

public class BigDecimalAbs {

    public static void main(String[] args) {
        BigDecimal bg1, bg2, bg3, bg4, bg5;
        
        bg1 = new BigDecimal("-40");
        
        System.out.println("Valus is : " + bg1);
        
        bg2 = bg1.abs();
        
        System.out.println("Absolute value is : " + bg2);
        
        //MathContext
        MathContext mc = new MathContext(2);
        MathContext mc1 = new MathContext(4);
        
        bg3 = new BigDecimal("40.1234");
        
        bg4 = bg3.abs(mc);
        bg5 = bg3.abs(mc1);
        
        System.out.println("mc : " + bg4);
        System.out.println("mc1 : " + bg5);
        
    }
    
}
