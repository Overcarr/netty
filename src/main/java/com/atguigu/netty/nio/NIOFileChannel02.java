package com.atguigu.netty.nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * 写入文件到系统
 */
public class NIOFileChannel02 {
    public static void main(String[] args) throws Exception {
        File file = new File("/Users/overcare/file01.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        FileChannel channel = fileInputStream.getChannel();

        ByteBuffer byteBuffer = ByteBuffer.allocate((int) file.length());
        channel.read(byteBuffer);

        System.out.println(new String(byteBuffer.array()));

        fileInputStream.close();
    }
}
