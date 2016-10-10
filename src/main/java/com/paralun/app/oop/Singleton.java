/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.oop;

public class Singleton {
    
    private static Singleton singleton = new Singleton();

    public Singleton() {
    }
    
    public static Singleton getInstance() {
        return singleton;
    }
    
    protected void demoMethod() {
        System.out.println("Demo method for singleton");
    }
}
