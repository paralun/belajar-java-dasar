/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.datetime;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class GregorianCalendarDemo {

    public static void main(String[] args) {
        String months[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
            "Aug", "Sep", "Oct", "Nov", "Dec"};

        GregorianCalendar gcalendar = new GregorianCalendar();
        System.out.println("Bulan : " + months[gcalendar.get(Calendar.MONTH)]);
        System.out.println("Tanggal : " + gcalendar.get(Calendar.DATE));
        System.out.println("Tahun : " + gcalendar.get(Calendar.YEAR));

        System.out.println("Jam : " + gcalendar.get(Calendar.HOUR));
        System.out.println("Menit : " + gcalendar.get(Calendar.MINUTE));
        System.out.println("Detik : " + gcalendar.get(Calendar.SECOND));

        Calendar calendar = new GregorianCalendar();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH); // Jan = 0, not 1
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
        int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);

        int hour = calendar.get(Calendar.HOUR);        // 12 hour clock
        int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY); // 24 hour clock
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        int millisecond = calendar.get(Calendar.MILLISECOND);

        System.out.println(year);
        System.out.println(month);
        System.out.println(dayOfMonth);

        Calendar cal = new GregorianCalendar();
        cal.set(Calendar.YEAR, 2009);
        cal.set(Calendar.MONTH, 11); // 11 = december
        cal.set(Calendar.DAY_OF_MONTH, 24); // christmas eve
        int year2 = cal.get(Calendar.YEAR);
        System.out.println(year2);

        cal.add(Calendar.YEAR, 1); //Tambah
        //cal.add(Calendar.YEAR, -1); //Kurang
        int year3 = cal.get(Calendar.YEAR);
        System.out.println(year3);

        //TimeZone
        Calendar cal2 = new GregorianCalendar();
        TimeZone timeZone1 = TimeZone.getTimeZone("America/Los_Angeles");
        cal2.setTimeZone(timeZone1);
        System.out.println("TimeZone : " + cal2.get(Calendar.HOUR));
        
    }

}
