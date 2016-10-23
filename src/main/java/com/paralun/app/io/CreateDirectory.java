/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.io;

import java.io.File;

public class CreateDirectory {

    public static void main(String[] args) {
        File file = new File("input" + File.separator + "Folder1");
        if(!file.exists()) {
            if(file.mkdir()){
                System.out.println("Directory is created!");
            }else {
                System.out.println("Failed to create directory!");
            }
        }else{
            System.out.println("Directory Exists!");
        }
        
        File files = new File("input" + File.separator + "Folder2\\Sub1\\Sub2");
        if(!files.exists()) {
            if(files.mkdirs()) {
                System.out.println("Multiple directories are created!");
            }else {
                System.out.println("Failed to create multiple directories!");
            }
        }else{
            System.out.println("Directory Exists!");
        }
    }
}
