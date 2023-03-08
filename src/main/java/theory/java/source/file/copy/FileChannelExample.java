package theory.java.source.file.copy;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

public class FileChannelExample {
    public static void main(String[] args) throws IOException {

        // 1. 원본 File, 복사할 File 준비
        RandomAccessFile file = new RandomAccessFile("D:\\example\\text_file.txt", "r");
        RandomAccessFile newFile = new RandomAccessFile("D:\\example\\new_text_file.txt", "rw");

        // 2. FileChannel 생성
        FileChannel source = file.getChannel();
        FileChannel target = newFile.getChannel();

        // 3. 복사
        source.transferTo(0, source.size(), target);
        // 또는
        //target.transferFrom(source, 0, source.size());

    }
}