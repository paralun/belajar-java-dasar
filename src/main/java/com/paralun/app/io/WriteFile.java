/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {

    public static void main(String[] args) {
        File file;
        FileOutputStream fos = null;
        String content = "write file menggunakan java";
        
        try {
            file = new File("input" + File.separator + "newFile.txt");
            fos = new FileOutputStream(file);
            
            if(!file.exists()) {
                file.createNewFile();
            }
            
            byte[] contentInByte = content.getBytes();
            fos.write(contentInByte);
            fos.flush();
            fos.close();
            
            System.out.println("Done");
        }catch(IOException e){
            System.out.println("Error : " + e.getMessage());
        }finally{
            try {
                if(fos != null){
                    fos.close();
                }
            }catch(IOException ex){}
        }
    }
}
