/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.number.bigdecimal;

import java.math.BigDecimal;

public class BigDecimalUnscaled {

    public static void main(String[] args) {
        System.out.println("unscaledValue for 0.0 : " + new BigDecimal("0.0").unscaledValue());
        System.out.println("unscaledValue for 134.23: " + new BigDecimal("134.23").unscaledValue());
        System.out.println("unscaledValue for -13.231: " + new BigDecimal("-13.231").unscaledValue());
    }

}
