package theory.java.source.file.write;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * packageName    : theory.java.source.file.write
 * fileName       : PrintWriter
 * author         : caprocoo
 * date           : 2023-03-09
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-03-09        caprocoo       최초 생성
 */
public class PrintWriterExample {
    public static void main(String[] args) {
        File file = new File("/home/js/test/text.txt");
        try {
            FileWriter fileWriter = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print("Hello~\n");
            printWriter.print("World!");
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
