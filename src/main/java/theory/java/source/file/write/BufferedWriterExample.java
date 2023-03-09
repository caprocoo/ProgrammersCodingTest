package theory.java.source.file.write;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * packageName    : theory.java.source.file.write
 * fileName       : BufferedWriterExample
 * author         : caprocoo
 * date           : 2023-03-09
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-03-09        caprocoo       최초 생성
 */
public class BufferedWriterExample {
    public static void main(String[] args) {
        File file = new File("/home/js/test/text.txt");
        String str = "Hello world!";

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(str);
            // append() 를 이용하여 여러번 text 를 입력할 수 있다.
            writer.append("asdwaas");
            writer.append("asdwaas");
            writer.append("asdwaas");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
