package Programmers.prac.level1;

public class 자릿수_더하기 {
    public int solution(int n) {
        int answer = 0;

        String str = String.valueOf(n);
        String[] arr = str.split("");
        for (int i = 0; i < arr.length; i++) {
            answer+=Integer.parseInt(arr[i]);
        }

        return answer;
    }

    public static void main(String[] args) {

        자릿수_더하기 a = new 자릿수_더하기();

        int n = 123;
        a.solution(n);
    }
}
