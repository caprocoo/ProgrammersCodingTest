package programmers.prac.level1;

public class 문자열을_정수로_만들기 {

    public int solution(String s) {
        return Integer.parseInt(s);
    }


    public static void main(String[] args) {

        문자열을_정수로_만들기 a = new 문자열을_정수로_만들기();

//        String s = "1234";
        String s = "-1234";

        a.solution(s);
    }
}
