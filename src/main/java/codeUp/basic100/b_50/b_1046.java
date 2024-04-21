package codeUp.basic100.b_50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : codeUp.basic100.b_50
 * fileName       : b_1046
 * author         : caprocoo
 * date           : 2024-04-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-21        caprocoo       최초 생성
 */
public class b_1046 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String[] arr = a.split(" ");
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            cnt += Integer.parseInt(arr[i]);
        }
        System.out.println(cnt);
        System.out.printf("%.1f", (double) cnt / arr.length);
    }
}
