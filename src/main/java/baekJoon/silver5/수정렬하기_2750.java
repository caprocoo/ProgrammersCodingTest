package baekJoon.silver5;


import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

import java.util.*;


/**
 * packageName    : baekJoon.silver5
 * fileName       : 수정렬하기_2750
 * author         : caprocoo
 * date           : 2024-04-22
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-22        caprocoo       최초 생성
 */

public class 수정렬하기_2750 {

    public static void main(String[] args) throws IOException {
        수정렬하기_2750 a = new 수정렬하기_2750();
        a.result();
    }

    public void result() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int[] numArr = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            int a = Integer.parseInt(br.readLine());
            numArr[i] = a;
        }

        Arrays.sort(numArr);
        for (int i = 0; i < numArr.length; i++) {
            System.out.println(numArr[i]);
        }
    }
}
