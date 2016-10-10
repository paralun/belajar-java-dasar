/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.contoh;

import java.util.Scanner;

public class ContohProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input Number : ");
        int x = input.nextInt();
        
        for(int i=0; i < x; i++) {
            for(int z=i; z < x; z++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
