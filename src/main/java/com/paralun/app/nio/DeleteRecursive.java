package com.paralun.app.nio;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class DeleteRecursive extends SimpleFileVisitor<Path> {

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        Files.delete(file);
        System.out.println(file.getFileName() + " deleted.");
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        Files.delete(dir);
        System.out.println(dir.getFileName() + " directory deleted.");
        return FileVisitResult.CONTINUE;
    }

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("d:\\todelete");
        DeleteRecursive deleteRecursive = new DeleteRecursive();
        Files.walkFileTree(path, deleteRecursive);
    }
}
