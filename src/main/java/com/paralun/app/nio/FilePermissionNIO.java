package com.paralun.app.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilePermissionNIO {
    public static void main(String[] args) {
        Path file = Paths.get("C:\\Users\\Cycle\\Desktop\\a.html");

        boolean isRegularFile = Files.isRegularFile(file);
        boolean isHidden = Files.isReadable(file);
        boolean isReadable = Files.isReadable(file);
        boolean isExecutable = Files.isExecutable(file);
        boolean isSymbolicLink = Files.isSymbolicLink(file);

        Path directory = Paths.get("C:\\Users\\Cycle\\Desktop");
        boolean isDirectory = Files.isDirectory(directory);
        boolean isWritable = Files.isWritable(directory);
    }
}
