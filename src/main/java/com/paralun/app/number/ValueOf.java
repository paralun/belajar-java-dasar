/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.number;

public class ValueOf {

    public static void main(String[] args) {
        Integer x = Integer.valueOf("30");
        Double d = Double.valueOf(5);
        Float f = Float.valueOf("78");
        
        //radix equals 10, 2, 8, or 16 respectively
        Integer i = Integer.valueOf("444", 16);
        
        System.out.println(x);
        System.out.println(d);
        System.out.println(f);
        System.out.println(i);
    }
    
}
