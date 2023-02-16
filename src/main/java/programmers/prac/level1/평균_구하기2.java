package programmers.prac.level1;

import java.util.Arrays;

public class 평균_구하기2 {
    public double solution(int[] arr) {
        double answer = 0;
        double total = Arrays.stream(arr).sum();
        answer = total/arr.length;
        return answer;
    }

    public static void main(String[] args) {

        평균_구하기2 a = new 평균_구하기2();

        int [] arr = {1,2,3,4};
//        int [] arr = {5,5}
        a.solution(arr);
    }
}
