package programmers.prac.level1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class 문자열_내림차순으로_배치하기2 {

    public String solution(String s) {
        return Stream.of(s.split("")).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
    }


    public static void main(String[] args) {

        문자열_내림차순으로_배치하기2 a = new 문자열_내림차순으로_배치하기2();

        String s = "Zbcdefg";

        a.solution(s);
    }
}
