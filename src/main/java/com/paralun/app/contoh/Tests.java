/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.contoh;

public class Tests {

    public static void main(String[] args) {
        Person p1 = new Person("Agus", "Musoleh", "agus@gmail.com");
        Person p2 = new Person("Sinta", "Laina", "sinta@gmail.com");
        
        Office office = new Office(p1, p2);
        
        System.out.println(office);
    }
    
}
