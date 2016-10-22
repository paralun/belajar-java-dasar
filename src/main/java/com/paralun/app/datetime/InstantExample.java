/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.datetime;

import java.time.Instant;

public class InstantExample {

    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println("Seconds : " + now.getEpochSecond());
        System.out.println("Nano : " + now.getNano());

        Instant later = now.plusSeconds(3);
        Instant earlier = now.minusSeconds(3);
    }

}
