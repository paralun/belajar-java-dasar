/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BelajarRegex {

    public static void main(String[] args) {
        String regex1 = "^ab"; // ^ = awal
        String regex2 = "ab$"; // $ = akhir
        String regex3 = ".ab";
        String regex4 =  "[ab]"; // [abc] = Set definition, can match the letter a or b or c.
        String regex5 = "[^ab]"; // kebalikan dari [ab]
        String line = "aba dimanab ab";
        
        Pattern p = Pattern.compile(regex5);
        Matcher m = p.matcher(line);
        
        System.out.println(m.replaceAll("-"));
        
        String line2 = "This is my small example "
                        + "string which I'm going to " + "use for pattern matching.";
        System.out.println(line2.matches("\\w.*"));
        String[] split = line2.split("\\s");
        for(String str : split) {
            System.out.println(str);
        }
    }
    
}
