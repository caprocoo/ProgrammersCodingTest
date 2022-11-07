package Programmers.prac.level2;

import java.util.Arrays;
import java.util.List;

class 최댓값과_최솟값1 {
    public String solution(String s) {
        int min, max, g;
//        List<String> list = List.of(s.split(" "));
        List<String> list = Arrays.asList(s.split(" "));

        min = max =  Integer.parseInt(list.get(0));
        for (int i = 0; i < list.size(); i++) {
            System.out.println("list.get(i) = " + list.get(i));
            if(min>Integer.parseInt(list.get(i))){
                min = Integer.parseInt(list.get(i));
            }
            if(max<Integer.parseInt(list.get(i))){
                max = Integer.parseInt(list.get(i));
            }
        }
        String answer = min + " " + max;
        return answer;
    }
    public static void main(String[] args) {

        최댓값과_최솟값1 solution = new 최댓값과_최솟값1();
        String s = "-1 -1";
//        String s = "1 2 3 4";

        solution.solution(s);


    }
}