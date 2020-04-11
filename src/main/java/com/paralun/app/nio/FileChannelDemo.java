package com.paralun.app.nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileChannelDemo {
    public static void main(String[] args) throws IOException {
        writeFileChannel(ByteBuffer.wrap("Halo semuanya".getBytes()));

        readFileChannel();
    }

    public static void readFileChannel() throws IOException {
        RandomAccessFile file = new RandomAccessFile("input\\file1.txt", "rw");
        FileChannel channel = file.getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(512);
        Charset charset = Charset.forName("US-ASCII");
        while (channel.read(byteBuffer) > 0) {
            byteBuffer.rewind();
            System.out.print(charset.decode(byteBuffer));
            byteBuffer.flip();
        }
        channel.close();
        file.close();
    }

    public static void writeFileChannel(ByteBuffer buffer) throws IOException {
        Path path = Paths.get("input\\file1.txt");
        FileChannel channel = FileChannel.open(path, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        channel.write(buffer);
        channel.close();
    }
}
