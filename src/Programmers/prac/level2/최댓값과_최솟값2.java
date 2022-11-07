package Programmers.prac.level2;

import java.util.Arrays;

class 최댓값과_최솟값2 {
    public String solution(String s) {

        String [] arr = s.split(" ");

        int [] ints = new int[arr.length];

        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(ints);

        String answer = ints[0]+" "+ints[ints.length-1];


        return answer;
    }
    public static void main(String[] args) {

        최댓값과_최솟값2 solution = new 최댓값과_최솟값2();
//        String s = "-1 -1";
        String s = "4 3 1 2";

        solution.solution(s);


    }
}