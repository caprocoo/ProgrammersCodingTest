package theory.java.source.file.copy;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class CopyFile {
    public static void main(String[] args) throws IOException {

        // 1. 원본 File, 복사할 File 준비
        File file = new File("D:\\example\\text_file.txt");
        File newFile = new File("D:\\example\\new_text_file.txt");

        // 2. 복사
        Files.copy(file.toPath(), newFile.toPath(), StandardCopyOption.REPLACE_EXISTING);

    }
}