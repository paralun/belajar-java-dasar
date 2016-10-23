/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.datetime.jodatime;

import java.util.Locale;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

public class FormatJodaTime {

    public static void main(String[] args) {
        DateTime dt = new DateTime();

        // ISO STANDARD 
        DateTimeFormatter isoFormat = ISODateTimeFormat.dateTime();
        System.out.println(isoFormat.print(dt));

        // CUSTOM FORMAT DATE
        DateTimeFormatter fmt1 = DateTimeFormat.forPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println(fmt1.print(dt));

        DateTimeFormatter fmt2 = DateTimeFormat.forPattern("dd/MMM/yyyy");
        System.out.println(fmt2.print(dt));

        // CONVERTING FORMAT DATE
        String dateBefore = "01/30/2016";
        String patternBefore = "MM/dd/yyyy";
        String patternAfter = "yyyy-MM-dd HH:mm:ss";
        
        DateTime dt2 = DateTime.parse(dateBefore, DateTimeFormat.forPattern(patternBefore));
        System.out.println(dt2.toString(patternAfter));
        
        DateTimeFormatter local = fmt2.withLocale(new Locale("id", "ID"));
        System.out.println(local.print(dt));

    }

}
