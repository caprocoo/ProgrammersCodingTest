package theory.java.source.file.write;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * packageName    : theory.java.source.file.write
 * fileName       : FileOutputStreamExample
 * author         : caprocoo
 * date           : 2023-03-09
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-03-09        caprocoo       최초 생성
 */
public class FileOutputStreamExample {
    public static void main(String[] args) {
        File file = new File("/home/js/test/text.txt");
        String str = "Hello World";
        byte[] bytes = str.getBytes();
        try {
            FileOutputStream outputStream = new FileOutputStream(file);
            outputStream.write(bytes);
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
