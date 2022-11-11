package programmers.prac.level1;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class 정수_내림차순으로_배치하기1 {

    public long solution(long n) {
        String str = String.valueOf(n);
        str = Stream.of(str.split("")).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
        return Long.parseLong(str);
    }


    public static void main(String[] args) {

        정수_내림차순으로_배치하기1 a = new 정수_내림차순으로_배치하기1();
        long n = 118372;
       
        a.solution(n);
    }
}
