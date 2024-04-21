package codeUp.basic100.b_30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : codeUp.basic100.b_30
 * fileName       : b_1027
 * author         : caprocoo
 * date           : 2024-04-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-21        caprocoo       최초 생성
 */
public class b_1027 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String data = br.readLine();
        String[] split = data.split("\\.");
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[1]);
        int c = Integer.parseInt(split[2]);
        System.out.printf("%02d-%02d-%04d", c,b,a);

    }
}
