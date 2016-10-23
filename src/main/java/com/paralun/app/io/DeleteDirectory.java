/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.io;

import java.io.File;
import java.io.IOException;

public class DeleteDirectory {

    public static void main(String[] args) {
        File file = new File("input" + File.separator + "Folder2");
        if (!file.exists()) {
            System.out.println("Directory does not exist.");
            System.exit(0);
        } else {
            try {
                delete(file);
            }catch(IOException e){
                System.exit(0);
            }
        }
    }

    private static void delete(File f) throws IOException{
        if (f.isDirectory()) {
            if (f.list().length == 0) {
                f.delete();
                System.out.println("Directory is deleted : " + f.getAbsolutePath());
            } else {
                String[] files = f.list();
                for (String temp : files) {
                    File fileDelete = new File(f, temp);
                    delete(fileDelete);
                }

                if (f.list().length == 0) {
                    f.delete();
                    System.out.println("Directory is deleted : " + f.getAbsolutePath());
                }
            }
        }else {
            f.delete();
            System.out.println("File is deleted : " + f.getAbsolutePath());
        }
    }

}
