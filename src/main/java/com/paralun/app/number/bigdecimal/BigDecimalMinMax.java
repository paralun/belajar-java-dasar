/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.number.bigdecimal;

import java.math.BigDecimal;

public class BigDecimalMinMax {

    public static void main(String[] args) {
        System.out.println("Min: " + new BigDecimal("300.34").min(new BigDecimal("150.87")));
        System.out.println("Max: " + new BigDecimal("300.34").max(new BigDecimal("150.87")));
    }

}
