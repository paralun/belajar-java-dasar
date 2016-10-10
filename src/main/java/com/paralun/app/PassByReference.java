/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app;

public class PassByReference {

    public static void main(String[] args) {
        String[] nama = new String[1];
        nama[0] = "bambang";
        System.out.println("nilai lama dari method main: " + nama[0]);
        ubahNama(nama);
        System.out.println("nilai lama dari method main: " + nama[0]);
    }

    public static void ubahNama(String[] nama) {
        nama[0] = "agus";
        System.out.println("nama baru di dalam method: " + nama[0]);
    }

}
