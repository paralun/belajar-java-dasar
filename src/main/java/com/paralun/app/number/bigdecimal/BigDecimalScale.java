/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.number.bigdecimal;

import java.math.BigDecimal;

public class BigDecimalScale {

    public static void main(String[] args) {
        //If zero or positive, the scale is the number of digits to the right of the decimal point.
        System.out.println("scale for 0.0 : " + new BigDecimal("0.0").scale());
        System.out.println("scale for 134.23: " + new BigDecimal("134.23").scale());
        //If negative, the unscaled value of the number is multiplied 
        //by ten to the power of the negation of the scale.
        System.out.println("scale for -13.231: " + new BigDecimal("-13.231").scale());
    }

}
