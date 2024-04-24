package codeUp.basic100.b_60;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : codeUp.basic100.b_60
 * fileName       : b_1054
 * author         : caprocoo
 * date           : 2024-04-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-24        caprocoo       최초 생성
 */
public class b_1054 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        result(a, b);
    }
    public static int result(int a, int b){
        if(a==1 && b==1) return 1;
        return 0;
    }
}
