/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BelajarRegex2 {

    public static void main(String[] args) {
        String USERNAME_PATTERN = "^[a-z0-9_-]{3,15}$";
        String PASSWORD_PATTERN
                = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";

        String HEX_PATTERN = "^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$";
        String EMAIL_PATTERN
                = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        String IMAGE_PATTERN =
                "([^\\s]+(\\.(?i)(jpg|png|gif|bmp))$)";
        String IPADDRESS_PATTERN =
		"^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
        String TIME12HOURS_PATTERN =
                                "(1[012]|[1-9]):[0-5][0-9](\\s)?(?i)(am|pm)";
        String TIME24HOURS_PATTERN =
                 "([01]?[0-9]|2[0-3]):[0-5][0-9]";
        String DATE_PATTERN =
          "(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)";
        String HTML_TAG_PATTERN = "<(\"[^\"]*\"|'[^']*'|[^'\">])*>";
        String HTML_A_TAG_PATTERN = "(?i)<a([^>]+)>(.+?)</a>";
        String HTML_A_HREF_TAG_PATTERN =
		"\\s*(?i)href\\s*=\\s*(\"([^\"]*\")|'[^']*'|([^'\">\\s]+))";
    }
}
