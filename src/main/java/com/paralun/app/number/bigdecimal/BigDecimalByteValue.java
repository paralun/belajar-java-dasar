/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.number.bigdecimal;

import java.math.BigDecimal;

public class BigDecimalByteValue {

    public static void main(String[] args) {
        BigDecimal bg1, bg2;
        byte b1, b2;
        
        bg1 = new BigDecimal("-128");
        bg2 = new BigDecimal("76");
        
        b1 = bg1.byteValueExact();
        b2 = bg2.byteValueExact();
        
        System.out.println(b1);
        System.out.println(b2);
    }
    
}
