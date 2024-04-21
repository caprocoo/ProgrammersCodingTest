package codeUp.basic100.b_40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : codeUp.basic100.b_40
 * fileName       : b_1039
 * author         : caprocoo
 * date           : 2024-04-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-21        caprocoo       최초 생성
 */
public class b_1039 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long a = Long.parseLong(br.readLine());
        long b = Long.parseLong(br.readLine());
        System.out.println(a+b);
    }
}
