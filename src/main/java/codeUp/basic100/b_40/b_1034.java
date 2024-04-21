package codeUp.basic100.b_40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : codeUp.basic100.b_40
 * fileName       : b_1034
 * author         : caprocoo
 * date           : 2024-04-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-21        caprocoo       최초 생성
 */
public class b_1034 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String data = br.readLine();
        // 8진수인 data 를 정수(10진수)로 바꾸겠다.
        int a = Integer.valueOf(data, 8);
        System.out.println(a);
    }
}
