/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.io;

import java.util.Scanner;

/**
 *
 * @author SwaHp
 */
public class ScannerExample {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = input.nextLine();
        System.out.println("Enter your age : ");
        int age = input.nextInt();
        
        System.out.println("Nama : " + name);
        System.out.println("Umur : " + age);
    }
    
}
