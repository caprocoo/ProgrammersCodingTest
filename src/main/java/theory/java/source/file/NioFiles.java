package theory.java.source.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * packageName    : theory.java.source.file
 * fileName       : NioFiles
 * author         : caprocoo
 * date           : 2023-03-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-03-06        caprocoo       최초 생성
 */
public class NioFiles {
    public static void main(String[] args) {
        Path filePath = Paths.get("d:\\example\\file.txt");

        try {
            Path newFilePath = Files.createFile(filePath);
            System.out.println(newFilePath);
        } 
        // 디렉토리가 존재하지 않을 경우 NoSuchFileException 이 발생
        // 생성하려는 파일이 이미 있을 경우 FileAlreadyExistException 이 발생
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
