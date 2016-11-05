/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.io;

import java.io.File;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args) {
        File file = new File("input" + File.separator + "newFile.txt");
        
        try {
            if(file.createNewFile()) {
                System.out.println("File is created!");
            }else {
                System.out.println("File already exists.");
            }
        }catch (IOException e) {
            
        }
    }
    
}
