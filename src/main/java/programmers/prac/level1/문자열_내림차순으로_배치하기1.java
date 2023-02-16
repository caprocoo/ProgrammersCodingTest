package programmers.prac.level1;

import java.util.Arrays;

public class 문자열_내림차순으로_배치하기1 {

    public String solution(String s) {
        char [] ch = s.toCharArray();
        Arrays.sort(ch);
        return new StringBuilder(new String(ch)).reverse().toString();
    }


    public static void main(String[] args) {

        문자열_내림차순으로_배치하기1 a = new 문자열_내림차순으로_배치하기1();

        String s = "Zbcdefg";

        a.solution(s);
    }
}
