package programmers.prac.level1;

public class 내적 {

    public int solution(int[] a, int[] b) {

        int answer = 0;
        for (int i = 0; i < a.length; i++) {
            answer+=(a[i]*b[i]);
        }
        return answer;
    }


    public static void main(String[] args) {

        내적 a = new 내적();

        int [] n = {1,2,3,4};
        int [] m = {-3,-1,0,2};

        a.solution(n,m);
    }
}
