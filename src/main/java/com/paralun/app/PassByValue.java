/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app;

public class PassByValue {

    public static void main(String[] args) {
        String nama = "bambang";
        System.out.println("nama lama dari method main: " + nama);
        ubahNama(nama);
        System.out.println("nama lama dari method main: " + nama);
    }

    public static void ubahNama(String nama) {
        nama = "agus";
        System.out.println("nama baru di dalam method: " + nama);
    }
}
