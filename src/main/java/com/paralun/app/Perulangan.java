/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app;

public class Perulangan {

    public static void main(String[] args) {
        
        //for
        System.out.println("Perulangan for");
        for(int i = 1; i <= 10; i++){
            System.out.print(i + "\t");
        }
        System.out.println();
        
        //while
        System.out.println("Perulangan while");
        int x = 1;
        while(x <= 10){
            System.out.print(x + "\t");
            x++;
        }
        System.out.println();
        
        //do - while
        System.out.println("Perulangan do - while");
        int z = 1;
        do{
            System.out.print(z + "\t");
            z++;
        }while(z <= 10);
        System.out.println();
        
        System.out.println("Perulangan dengan perintah break");
        for(int i = 1; i <= 10; i++){
            System.out.print(i + "\t");
            if(i == 5){
                break;
            }
        }
        System.out.println();
        
        System.out.println("Perulangan dengan perintah continue");
        for(int i = 1; i <= 10; i++){
            if(i % 2 == 0){
                continue;
            }
            System.out.print(i + "\t");
        }
        System.out.println();
        
        //Foreach
        System.out.println("Perulangan Foreach");
        String[] names = {"Bambang", "Agus", "Diana", "Putri"};
        for(String name : names) {
            System.out.println(name);
        }
    }
    
}
