/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateMethod {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date1 = sdf.parse("12/10/2016");
        Date date2 = sdf.parse("13/10/2016");
        
        int a = date1.compareTo(date2);
        System.err.println("Hasil : " + a);
        
        boolean after = date1.after(date2);
        boolean before = date1.before(date2);
        Date clone = (Date) date1.clone();
        boolean equals = date1.equals(date2);
        long gettime = date1.getTime();
        
        System.out.println("After : " + after);
        System.out.println("Before : " + before);
        System.out.println("Clone : " + clone);
        System.out.println("Equals : " + equals);
        System.out.println("Get Time : " + gettime);
        
    }
    
}
