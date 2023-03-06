package theory.java.source.file;

import java.io.IOException;

/**
 * packageName    : theory.java.source.file
 * fileName       : IoFile
 * author         : caprocoo
 * date           : 2023-03-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-03-06        caprocoo       최초 생성
 */

// createNewFile 은 example 디렉토리에 비어있는 file.txt 가 생성되고, true를 리턴한다.
// 기존에 file.txt 파일이 존재한다면 false 를 리턴한다.
public class IoFile {
    public static void main(String[] args) {
        java.io.File file = new java.io.File("d:\\example\\file.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("File already exists");
            }
        }
        // 지정한 디렉토리가 존재하지 않으면 IOException 을 발생시킨다.
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
