package baekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : baekJoon
 * fileName       : 꼬마_정민
 * author         : caprocoo
 * date           : 2023-05-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-05-03        caprocoo       최초 생성
 */
public class 꼬마_정민 {
    public static void main(String[] args) throws IOException {
        꼬마_정민 a = new 꼬마_정민();
        a.result();
    }

    public long result() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long C = Long.parseLong(st.nextToken());
        System.out.println(A + B + C);


        return A+B+C;
    }
}
