package com.paralun.app.largeFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ScannerRead {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        try (Scanner sc = new Scanner(new File("input\\file.txt"), "UTF-8")) {
            //long freeMemoryBefore = Runtime.getRuntime().freeMemory();
            while (sc.hasNextLine()) {

                String line = sc.nextLine();
                // parse line
                //System.out.println(line);
            }

            // note that Scanner suppresses exceptions
            if (sc.ioException() != null) {
                sc.ioException().printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        long endTime = System.nanoTime();
        long elapsedTimeInMillis = TimeUnit.MILLISECONDS.convert((endTime - startTime), TimeUnit.NANOSECONDS);
        System.out.println("Total elapsed time: " + elapsedTimeInMillis + " ms"  );
    }
}
