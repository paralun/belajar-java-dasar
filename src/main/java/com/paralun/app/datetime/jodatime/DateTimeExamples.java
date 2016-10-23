/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.datetime.jodatime;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Date;

public class DateTimeExamples {
    public static void main(String[] args) {

        //define joda date time
        DateTime dt = new DateTime();
        //get current date time
        // from Joda to JDK
        Date currentDateTime = dt.toDate();
        //print out current date time in simple date time format
        System.out.println(currentDateTime);
        //convert jdk date to joda time
        dt = new DateTime(currentDateTime);
        //get current day
       int dow=dt.dayOfMonth().get();
        System.out.println(dow +"   day");
        //add few days
        int daysToAdd=5;
        int newDay=dt.plusDays(daysToAdd).getDayOfMonth();
        System.out.println(newDay +"   day");
        //Get day time property
        dt=new DateTime(dt.plusDays(daysToAdd));
        DateTime.Property pDoW = dt.dayOfWeek();
        String shortDayName=pDoW.getAsShortText();
        System.out.println("Short Day Name    "+shortDayName);
        String fullDayName=pDoW.getAsText();
        System.out.println("Full Day Name    "+fullDayName);
       //get month info
        String month = dt.monthOfYear().getAsText();
        System.out.println("Month is: " +month);
        int maxDay = dt.dayOfMonth().getMaximumValue();
        System.out.println("Maximum days: " + maxDay);
        boolean leapYear = dt.yearOfEra().isLeap();
        System.out.println( "Is leap year: " + leapYear);
        //get era, century, month, week, day information
      System.out.println("Era is :"+  dt.getEra());
        System.out.println("Year is :"+dt.getYear());
        System.out.println("Week is :"+dt.getWeekyear());
        System.out.println("Century  is :"+dt.getCenturyOfEra());
        System.out.println("Year of Era is :"+dt.getYearOfEra());
        System.out.println("Year of Century is :"+dt.getYearOfCentury());
        System.out.println("Month of Year :"+dt.getMonthOfYear());
        System.out.println("Week of Year :"+dt.getWeekOfWeekyear());
        System.out.println("Day of Year :"+dt.getDayOfYear());
        System.out.println("Day of Month:"+dt.getDayOfMonth());
        System.out.println("Day of Week :"+dt.getDayOfWeek());
        //format date time
        DateTimeFormatter fmt = DateTimeFormat.forPattern("yyyyMMMdd");
        String d = dt.toString(fmt);
        System.out.println("Time in format yyyyMMdd is "+d);
        //Date time zone
        DateTime dt1=new DateTime();
        Date current=dt1.toDate();
        dt1=new DateTime(current);
        DateTimeZone zoneLondon = DateTimeZone.forID("Europe/London");
        DateTime dtZoneLondon=new DateTime(dt1.withZone(zoneLondon));
        System.out.println("Date time in London zone    " +dtZoneLondon);
        DateTimeZone zoneHongkong=DateTimeZone.forID("Asia/Hong_Kong");
        DateTime dtZoneHongkong=new DateTime(dt1.withZone(zoneHongkong));
        System.out.println("Date time in Hongkong zone    " +dtZoneHongkong);

    }
}
