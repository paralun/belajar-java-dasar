package com.paralun.app.nio;

import java.io.IOException;
import java.nio.file.*;

public class NioFiles {

    public boolean fileExists() {
        Path path = Paths.get("input\\file1.txt");
        return Files.exists(path);
    }

    public String buatDirectory() {
        String output = "";
        Path path = Paths.get("input\\subdir");
        try {
            Files.createDirectory(path);
            output = "Created";
        }catch (FileAlreadyExistsException fa){
            output = "Directory sudah ada";
        }catch (IOException ie) {
            output = "Error";
        }
        return output;
    }

    public String copyFile() {
        String output = "";
        Path path1 = Paths.get("input\\file1.txt");
        Path path2 = Paths.get("input\\subdir\\file1-copy.txt");
        try {
            //Files.copy(path1, path2);
            Files.copy(path1, path2, StandardCopyOption.REPLACE_EXISTING);
            output = "Tercopy";
        }catch (FileAlreadyExistsException fa){
            output = "File sudah ada";
        }catch (IOException ie) {
            output = "Error";
        }
        return output;
    }

    public String tulisFile() {
        String output = "";
        Path path = Paths.get("input\\tulisFile.txt");
        try {
            String data = "Halo Semuanya";
            //Files.write(path, data.getBytes("utf-8"), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            Files.write(path, data.getBytes("utf-8"), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            output = "Sukses";
        }catch (FileAlreadyExistsException fa){
            output = "File sudah ada";
        }catch (IOException ie) {
            output = "Error";
        }
        return output;
    }

}
