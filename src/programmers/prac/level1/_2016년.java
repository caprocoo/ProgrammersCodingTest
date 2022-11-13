package programmers.prac.level1;



public class _2016년 {

    public String solution(int a, int b) {
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int date = 0;
        for (int i = 0; i < a-1; i++) {
            date+=month[i];
        }
        date+=b-1;

        return day[date%7];
    }

    public static void main(String[] args) {

        _2016년 a = new _2016년();

        int n = 5;
        int m = 24;
        a.solution(n,m);
    }
}
