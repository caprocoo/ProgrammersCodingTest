package baekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : baekJoon
 * fileName       : 주사위_세개
 * author         : caprocoo
 * date           : 2023-05-04
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-05-04        caprocoo       최초 생성
 */
public class 주사위_세개 {
    public static void main(String[] args) throws IOException {

        주사위_세개 a = new 주사위_세개();
        a.result();

    }
    public long result() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());
        long c = Integer.parseInt(st.nextToken());

        long result = 0;

        if (a != b && b != c && a != c) {
            long max = Math.max(a, Math.max(b, c));
            result = max * 100;

        } else if (a == b && a == c) {
            result = 10000 + a * 1000;
        } else if (a == b || a == c) {
            result = 1000 + a * 100;
        } else{
            result = 1000 + b * 100;
        }

        System.out.println(result);
        return result;

    }


}
