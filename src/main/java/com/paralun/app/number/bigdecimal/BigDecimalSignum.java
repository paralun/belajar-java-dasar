/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.number.bigdecimal;

import java.math.BigDecimal;

public class BigDecimalSignum {

    public static void main(String[] args) {
        //-1 for values < 0
        System.out.println("signum for -15.56: " + new BigDecimal("-15.56").signum());
        //0 for value 0
        System.out.println("signum for   0.0: " + new BigDecimal("0.0").signum());
        //1 for values > 0
        System.out.println("signum for  25.43: " + new BigDecimal("25.43").signum());
    }

}
