package programmers.prac.level1;

import java.util.Arrays;

public class 정수_내림차순으로_배치하기2 {

    public long solution(long n) {
        String [] arr = String.valueOf(n).split("");
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }

        return Long.parseLong(String.valueOf(sb.reverse()));
    }


    public static void main(String[] args) {

        정수_내림차순으로_배치하기2 a = new 정수_내림차순으로_배치하기2();
        long n = 118372;
       
        a.solution(n);
    }
}
