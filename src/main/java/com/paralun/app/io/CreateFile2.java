/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author SwaHp
 */
public class CreateFile2 {

    public static void main(String[] args) {
        
        try {
            File file = new File("input" + File.separator + "filename.txt");
            String content = "Ini text menggunakan java";
            
            if(!file.exists()){
                file.createNewFile();
            }
            
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();
            
            System.out.println("Done");
        }catch(IOException ex) {
            
        }
    }
    
}
