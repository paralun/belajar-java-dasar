package com.paralun.app.nio;

public class MainNio {
    public static void main(String[] args) {
        NioFiles nioFiles = new NioFiles();
        System.out.println(nioFiles.fileExists());
        System.out.println(nioFiles.buatDirectory());
        System.out.println(nioFiles.copyFile());
        System.out.println(nioFiles.tulisFile());
    }
}
