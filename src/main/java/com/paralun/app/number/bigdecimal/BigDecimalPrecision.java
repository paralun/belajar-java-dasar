/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.number.bigdecimal;

import java.math.BigDecimal;

public class BigDecimalPrecision {

    public static void main(String[] args) {
        System.out.println("precision for 0.0 : " + new BigDecimal("0.0").precision());
        System.out.println("precision for 134.23: " + new BigDecimal("134.23").precision());
        System.out.println("precision for -13.231: " + new BigDecimal("-13.231").precision());
    }

}
