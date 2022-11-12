package programmers.prac.level1;


import java.util.Arrays;

public class 예산 {

    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        int value = 0;
        for (int i = 0; i < d.length; i++) {
            value +=d[i];
            if(value<=budget){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        예산 a = new 예산();

//        int [] n = {1,3,2,5,4};
        int [] n = {2,2,3,3};
        int budget = 10;
        a.solution(n, budget);
    }
}
