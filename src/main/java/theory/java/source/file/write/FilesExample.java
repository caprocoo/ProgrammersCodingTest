package theory.java.source.file.write;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * packageName    : theory.java.source.file.write
 * fileName       : FilesExample
 * author         : caprocoo
 * date           : 2023-03-09
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-03-09        caprocoo       최초 생성
 */
public class FilesExample {
    public static void main(String[] args) {
        String str = "Hello";
        byte[] bytes = str.getBytes();
        Path path = Paths.get("/home/js/test/text.txt");
        try {
            Files.write(path, bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
