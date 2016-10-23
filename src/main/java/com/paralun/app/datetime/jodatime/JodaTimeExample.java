/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.datetime.jodatime;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

public class JodaTimeExample {

    public static void main(String[] args) {
        DateTime dt = new DateTime();
        /**
         * Date fields
        dt.getEra();
        dt.getYear();
        dt.getWeekyear();
        dt.getCenturyOfEra();
        dt.getYearOfEra();
        dt.getYearOfCentury();
        dt.getMonthOfYear();
        dt.getWeekOfWeekyear();
        dt.getDayOfYear();
        dt.getDayOfMonth();
        dt.getDayOfWeek();
        **/
        
        System.out.println("Year : " + dt.getYear());
        System.out.println("Month : " + dt.getMonthOfYear());
        System.out.println("Month : " + dt.monthOfYear().getAsText());
        System.out.println("Day : " + dt.getDayOfMonth());
        System.out.println("Day : " + dt.getDayOfWeek());
        System.out.println("Day : " + dt.dayOfWeek().getAsText());
        
        DateTime.Property pDow = dt.dayOfWeek();
        System.out.println("Day : " + pDow.getAsShortText());
        System.out.println("Day : " + pDow.getAsText());
        

        System.out.println("Hour : " + dt.getHourOfDay());
        System.out.println("Minute : " + dt.getMinuteOfHour());
        System.out.println("Second : " + dt.getSecondOfMinute());
        
        //Convert to Date, Calendar
        Date jdkDate = dt.toDate();
        DateTime jdt = new DateTime(jdkDate);
        
        Calendar jdkCal = dt.toCalendar(Locale.ROOT);
        DateTime jdt1 = new DateTime(jdkCal);
        
        GregorianCalendar jdkGCal = dt.toGregorianCalendar();
        DateTime jdt2 = new DateTime(jdkGCal);
        
        
        // Specific TimeZone
        DateTime dtTokyo = dt.withZone(DateTimeZone.forID("Asia/Tokyo"));
        System.out.println(dtTokyo);
        
        DateTime indonesia = dt.withZone(DateTimeZone.forID("Asia/Jakarta"));
        System.out.println(indonesia);
        System.out.println(indonesia.monthOfYear().getAsText());

    }
}
