/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BelajarRegex1 {

    public static void main(String[] args) {
        String content = "This is Chaitanya " +
	    "from Beginnersbook.com.";
        String pattern = ".*book.*";
        
        boolean match = Pattern.matches(pattern, content);
        System.out.println("Hasil : " + match);
        
        String content2 = "This is a tutorial Website!";
        String pattern2 = ".*tuToRiAl.*";
        Pattern p = Pattern.compile(pattern2, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(content2);
        System.out.println(m.matches());
    }
}
