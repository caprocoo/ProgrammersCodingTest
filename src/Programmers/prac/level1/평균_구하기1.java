package Programmers.prac.level1;

public class 평균_구하기1 {
    public double solution(int[] arr) {
        double answer = 0;
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total+=arr[i];
        }
        answer = total/arr.length;
        return answer;
    }

    public static void main(String[] args) {

        평균_구하기1 a = new 평균_구하기1();

        int [] arr = {1,2,3,4};
//        int [] arr = {5,5}
        a.solution(arr);
    }
}
