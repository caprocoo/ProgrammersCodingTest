package programmers.prac.level2;

import java.util.Arrays;

class 최솟값_만들기1 {
    public int solution(int []a, int []b)
    {
        Arrays.sort(a);
        Arrays.sort(b);

        int answer = 0;

        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[a.length-i-1];
        }




        return answer;
    }
    public static void main(String[] args) {

        최솟값_만들기1 solution = new 최솟값_만들기1();

        int [] a = {1,4,2};
        int [] b = {5,4,4};

        solution.solution(a,b);


    }
}