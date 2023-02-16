package programmers.prac.level1;


public class _3진법_뒤집기 {

    public int solution(int n) {
        StringBuilder three = new StringBuilder(Integer.toString(n, 3));
        three.reverse();
        return Integer.parseInt(String.valueOf(three), 3);
    }

    public static void main(String[] args) {

        _3진법_뒤집기 a = new _3진법_뒤집기();

        int n = 45;
        a.solution(n);
    }
}
