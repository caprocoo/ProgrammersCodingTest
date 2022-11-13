package programmers.prac.level1;


import java.util.ArrayList;
import java.util.Collections;

public class 문자열_내_마음대로_정렬하기2 {

    public String[] solution(String[] strings, int n) {

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            list.add(strings[i].charAt(n)+strings[i]);
        }
        Collections.sort(list);
        String[] arr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i).substring(1);
        }
        return arr;
    }

    public static void main(String[] args) {

        문자열_내_마음대로_정렬하기2 a = new 문자열_내_마음대로_정렬하기2();

//        String [] arr ={"sun","bed","car"};
        String [] arr ={"abce", "abcd", "cdx"};
        int n = 2;
        a.solution(arr,n);
    }
}
