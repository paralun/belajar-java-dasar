/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app;

public class ContohArray {

    public static void main(String[] args) {
        
        int a[] = new int[5];
        a[0] = 10;
        a[1] = 4;
        a[2] = 2;
        a[3] = 7;
        a[4] = 9;
        System.out.println("Index 0 : " + a[0]);
        System.out.println("Index 1 : " + a[1]);
        System.out.println("Index 2 : " + a[2]);
        System.out.println("Index 3 : " + a[3]);
        System.out.println("Index 4 : " + a[4]);
        
        System.out.println("===================");
        System.out.println("Array Multidimensi");
        int b[][] = new int[3][3];
        for(int i = 0; i < 3; i++){
            for(int x = 0; x < 3; x++){
                b[i][x] = x;
            }
        }
        
        for(int i = 0; i < 3; i++){
            System.out.print("[");
            for(int x = 0; x < 3; x++){
                System.out.print(b[i][x]+ "\t");
            }
            System.out.print("]");
            System.out.println();
        }
        
        
    }
    
}
