package codeUp.basic100.b_20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : codeUp.basic100.b_20
 * fileName       : b_1019
 * author         : caprocoo
 * date           : 2024-04-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-21        caprocoo       최초 생성
 */
public class b_1019 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String data = br.readLine();
        String[] arr = data.split("\\.");
        int a = Integer.valueOf(arr[0]);
        int b = Integer.valueOf(arr[1]);
        int c = Integer.valueOf(arr[2]);
        System.out.printf("%04d.%02d.%02d", a,b,c);
    }
}
