package theory.java.source.file;

import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileOutputStream;

/**
 * packageName    : theory.java.source.file
 * fileName       : FileOutputStream
 * author         : caprocoo
 * date           : 2023-03-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-03-06        caprocoo       최초 생성
 */
public class IoFileOutputStream {
    public static void main(String[] args) {
        File file = new File("d:\\example\\file.txt");

        try {
            FileOutputStream ioFileOutputStream = new FileOutputStream(file, true);
        } 
        // 디렉토리가 존재하지 않을 경우 FileNotFoundException 발생
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
