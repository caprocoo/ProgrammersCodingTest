package programmers.prac.level2;

public class 예상_대진표 {
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        while(a!=b){
            a = a/2 + a%2;
            b = b/2 + b%2;
            answer++;
        }
        return answer;
    }


    public static void main(String[] args) {
        예상_대진표 g = new 예상_대진표();

        int n = 8;
        int a = 4;
        int b = 7;

        g.solution(n,a,b);
    }
}
