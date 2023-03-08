package theory.java.source.file.copy;
import java.io.*;

public class FileInputOutput {
    public static void main(String[] args) throws IOException {
        // 1. 원본 File, 복사할 File 준비
        File file = new File("D:\\example\\text_file.txt");
        File newFile = new File("D:\\example\\new_text_file.txt");

        // 2. FileInputStream, FileOutputStream 준비
        FileInputStream input = new FileInputStream(file);
        FileOutputStream output = new FileOutputStream(newFile);

        // 3. 한번에 read하고, write할 사이즈 지정
        byte[] buf = new byte[1024];

        // 4. buf 사이즈만큼 input에서 데이터를 읽어서, output에 쓴다.
        int readData;

        // readData = input.read(buf);
        // buf 에 데이터를 읽어서 넣고, buf 로 읽은 총 byte 수를 리턴한다.
        // 파일 끝에 도달하여, 더 이상 읽을 데이터가 없을 경우 -1을 리턴한다.
        while ((readData = input.read(buf)) > 0) {
            // buf 에 담긴 데이터를 0번째 offset 부터, readData 길이만큼 output stream 에 쓴다.
            output.write(buf, 0, readData);
        }

        // 5. Stream close
        input.close();
        output.close();
    }
}
