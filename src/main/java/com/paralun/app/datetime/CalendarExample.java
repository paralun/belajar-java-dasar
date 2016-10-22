/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarExample {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("The current date is : " + df.format(cal.getTime()));
        
        int year = cal.get(Calendar.YEAR);
        System.out.println(year);
        
        //convert to Date
        Date date = cal.getTime();
        //convert date to calendar
        cal.setTime(new Date());
        
    }
    
}
