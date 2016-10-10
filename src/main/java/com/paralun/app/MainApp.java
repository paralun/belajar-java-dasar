/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app;

public class MainApp {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!!!");
        System.out.print("Test\n");
        System.out.printf("Char: %c, decimal: %d, Float: %.2f, String: %s", 'A', 10, 12f, "Bambang");
        
        System.out.printf("%3d\n", 0);
        System.out.printf("%3d\n", 123456789);
        System.out.printf("%3d\n", -10);
        System.out.printf("%3d\n", -123456789);
        System.out.printf("%-3d\n", 0);
        System.out.printf("%-3d\n", 123456789);
        System.out.printf("%-3d\n", -10);
        System.out.printf("%-3d\n", -123456789);
        System.out.printf("%03d\n", 0);
        System.out.printf("%03d\n", 1);
        System.out.printf("%03d\n", 123456789);
        System.out.printf("%03d\n", -10);
        System.out.printf("%03d\n", -123456789);
        System.out.printf("'%5d'", 10);
        System.out.printf("'%-5d'", 10);
        System.out.printf("'%05d'", 10);
        System.out.printf("'%+5d'", 10);
        System.out.printf("'%-+5d'", 10);
        
        System.out.printf("'%.1f'", 10.3456);
        System.out.printf("'%.2f'", 10.3456);
        System.out.printf("'%8.2f'", 10.3456);
        System.out.printf("'%8.4f'", 10.3456);
        System.out.printf("'%08.2f'", 10.3456);
        System.out.printf("'%-8.2f'", 10.3456);
        System.out.printf("'%-8.2f'", 101234567.3456);
        
        System.out.printf("'%s'", "Hello");
        System.out.printf("'%10s'", "Hello");
        System.out.printf("'%-10s'", "Hello");
    }
}
