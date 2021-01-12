package com.atguigu.netty.nio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;


/**
 * 写出文件到磁盘
 */
public class NIOFileChannel01 {
    public static void main(String[] args) throws Exception {
        String s = "hello,你好呀，尹凯";
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/overcare/file01.txt");
        FileChannel channel = fileOutputStream.getChannel();

        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        byteBuffer.put(s.getBytes());
        byteBuffer.flip();
        channel.write(byteBuffer);
        fileOutputStream.close();
    }
}
