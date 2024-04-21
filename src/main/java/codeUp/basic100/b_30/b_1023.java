package codeUp.basic100.b_30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : codeUp.basic100.b_30
 * fileName       : b_1023
 * author         : caprocoo
 * date           : 2024-04-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-21        caprocoo       최초 생성
 */
public class b_1023 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String data = br.readLine();
        String[] arr = data.split("\\.");
        System.out.printf("%s\n%s", arr[0], arr[1]);
    }
}
