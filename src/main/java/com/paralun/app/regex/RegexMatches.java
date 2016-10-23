/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {

    public static void main(String[] args) {
        String line = "This order was placed for QT3000! OK?";
        String pattern = "(.*)(\\d+)(.*)";

        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

        // Now create matcher object.
        Matcher m = r.matcher(line);
        if (m.find()) {
            System.out.println("Found value: " + m.group(0));
            System.out.println("Found value: " + m.group(1));
            System.out.println("Found value: " + m.group(2));
        } else {
            System.out.println("NO MATCH");
        }

        String REGEX = "\\bcat\\b";
        String INPUT = "cat cat cat cattie cat";
        Pattern r1 = Pattern.compile(REGEX);
        Matcher m1 = r1.matcher(INPUT);
        int count = 0;

        while (m1.find()) {
            count++;
            System.out.println("Match number " + count);
            System.out.println("start(): " + m1.start());
            System.out.println("end(): " + m1.end());
        }

        String REGEX1 = "foo";
        String INPUT1 = "fooooooooooooooooo";
        Pattern r2 = Pattern.compile(REGEX1);
        Matcher m2 = r2.matcher(INPUT1);
        System.out.println("Current REGEX is: " + REGEX1);
        System.out.println("Current INPUT is: " + INPUT1);

        System.out.println("lookingAt(): " + m2.lookingAt());
        System.out.println("matches(): " + m2.matches());
        
        String REGEX2 = "dog";
        String INPUT2 = "The dog says meow. " + "All dogs say meow.";
        String REPLACE = "cat";
        Pattern r3 = Pattern.compile(REGEX2);
        Matcher m3 = r3.matcher(INPUT2);
        System.out.println("Hasil :" + m3.replaceAll(REPLACE));
        
        String REGEX3 = "a*b";
        String INPUT3 = "aabfooaabfooabfoobbaafo";
        String REPLACE1 = "-";
        Pattern r4 = Pattern.compile(REGEX3);
        Matcher m4 = r4.matcher(INPUT3);
        System.out.println("Hasil :" + m4.replaceAll(REPLACE1));
        
    }

}
