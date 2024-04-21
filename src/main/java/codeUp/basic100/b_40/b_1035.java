package codeUp.basic100.b_40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : codeUp.basic100.b_40
 * fileName       : b_1035
 * author         : caprocoo
 * date           : 2024-04-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-21        caprocoo       최초 생성
 */
public class b_1035 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String data = br.readLine();
        int a = Integer.valueOf(data, 16);
        String s = Integer.toOctalString(a);
        System.out.println(s);
    }
}
