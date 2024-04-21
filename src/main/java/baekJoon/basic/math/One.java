package baekJoon.basic.math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * packageName    : baekJoon.basic.math
 * fileName       : one
 * author         : caprocoo
 * date           : 2023-05-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-05-05        caprocoo       최초 생성
 */
public class One {
    public static void main(String[] args) {
        String input = "?gubuncd=P1&page=6";
        String target = "&page=";
        int index = input.indexOf(target);

        if (index != -1) {
            String result = input.substring(index);
            System.out.println(result);
        }
    }

    public void result() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    }
}
