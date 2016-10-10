/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app;

public class ContohVariabel {
    
    int a, b, c;
    int d = 10, g = 7;
    char z = 'z';
    double pi = 3.14159;
    
    
    //Local Variable
    public void localVariabel() {
        int age = 10;
        age = age + 20;
        System.out.println("Age:" + age);
    }
    
    /** --------------Instance Variable-------------- **/
    public String nama;

    //constructor
    public ContohVariabel(String nama) {
        this.nama = nama;
    }
    
    public void printNama() {
        System.out.println("Nama : " + nama);
    }
    //======================================
    
    //Static Variable
    private static double salary;
    private static final String DEPARTEMENT = "Production";
    
    public static void main(String[] args) {
        ContohVariabel cv = new ContohVariabel(null);
        cv.localVariabel();
        
        ContohVariabel cv1 = new ContohVariabel("Bambang");
        cv1.printNama();
        
        salary = 2000;
        System.out.println(DEPARTEMENT + " average salary: " + salary);
    }
    
}
