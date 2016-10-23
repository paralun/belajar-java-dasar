/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.datetime.jodatime;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Months;
import org.joda.time.MutableDateTime;
import org.joda.time.Period;

public class ModifyingDateTime {

    public static void main(String[] args) {
        DateTime dt = new DateTime();

        // IMMUTABLE DateTime
        DateTime dt1 = dt.year().setCopy(2015);
        System.out.println(dt1);

        DateTime dt2 = dt.monthOfYear().setCopy(12);
        System.out.println(dt2);

        DateTime dt3 = dt.dayOfMonth().setCopy(15);
        System.out.println(dt3);

        // ADD one year
        DateTime dt4 = dt.plusYears(1);
        System.out.println(dt4);

        // SUBTRACT one year
        DateTime dt5 = dt.plusYears(-1);
        System.out.println(dt5);

        // MUTABLE
        MutableDateTime mdt = dt.toMutableDateTime();
        mdt.addYears(2);
        System.out.println(mdt);
        mdt.addYears(-2);
        System.out.println(mdt);

        // Comparing Dates
        DateTime start = new DateTime(2015, 12, 25, 0, 0, 0, 0); // 2015/12/25 00:00:00
        DateTime end = new DateTime(2016, 12, 30, 0, 0, 0, 0);

        // period of 1 year and 5 days
        Period period = new Period(start, end);
        System.out.println(period.getYears());	//1
        System.out.println(period.getDays()); 	//5

        // days between start and end
        Days days = Days.daysBetween(start, end);
        System.out.println(days.getDays());	//371

        // months between start and end
        Months month = Months.monthsBetween(start, end);
        System.out.println(month.getMonths());	//12

        //isBefore()
        System.out.println(start.isBefore(end)); //true

        //isBeforeNow()
        System.out.println(end.isBeforeNow());	 //false (now is 2016/06/08)

        //equals()
        System.out.println(start.equals(end));	 //false	

    }

}
