package com.paralun.app.nio;

import java.io.File;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioPath {

    public static void main(String[] args) throws URISyntaxException {
        //Path path = Paths.get("d:\\data\\test.txt");
        Path path = Paths.get("input\\file1.txt");
        System.out.println(path.getFileName());

        Path path1 = Paths.get(ClassLoader.getSystemResource("catatan/catatan1.txt").toURI());
        System.out.println(path1.getFileName());
    }
}
