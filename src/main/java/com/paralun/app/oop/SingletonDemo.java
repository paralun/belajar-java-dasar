/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.oop;

public class SingletonDemo {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.demoMethod();
    }
    
}
