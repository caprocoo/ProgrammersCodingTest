package programmers.prac.level1;

public class 문자열_내_p와_y의_개수2 {

    boolean solution(String s) {

        s = s.toUpperCase();
        return s.chars().filter(e->'P'==e).count() == s.chars().filter(e->'Y'==e).count();
    }


    public static void main(String[] args) {

        문자열_내_p와_y의_개수2 a = new 문자열_내_p와_y의_개수2();

        String s = "pPoooyY";
        a.solution(s);
    }
}
