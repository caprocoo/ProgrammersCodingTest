package programmers.prac.level1;


import java.util.Arrays;

public class 문자열_내_마음대로_정렬하기 {

    public String[] solution(String[] strings, int n) {

        for (int i = 0; i < strings.length; i++) {
            String first = strings[i].substring(n, n+1);
            strings[i] = first + strings[i];
        }
        Arrays.sort(strings);
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].substring(1);
        }
        return strings;
    }

    public static void main(String[] args) {

        문자열_내_마음대로_정렬하기 a = new 문자열_내_마음대로_정렬하기();

//        String [] arr ={"sun","bed","car"};
        String [] arr ={"abce", "abcd", "cdx"};
        int n = 2;
        a.solution(arr,n);
    }
}
