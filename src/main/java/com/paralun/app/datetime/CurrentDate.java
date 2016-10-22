/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDate {

    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println("Date : " + date.toString());
        
        long now = date.getTime();
        System.out.println("Now : " + now);
        
        long millis = System.currentTimeMillis();
        Date date1 = new Date(millis);
        System.out.println("Date1 : " + date1);
        
        SimpleDateFormat format = new SimpleDateFormat("E dd/MM/yyyy 'at' hh:mm:ss a zzz");
        System.out.println("Format : " + format.format(date));
        
        SimpleDateFormat format2 = new SimpleDateFormat("dd/MM/yyyy");
        //Convert String Date to Date
        String dateString = "20/09/2016";
        Date date2 = format2.parse(dateString);
        System.out.println(date2);
    }
    
}
