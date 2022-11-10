package programmers.prac.level1;

public class 정수_제곱근_판별1 {
    public long solution(long n) {


        long answer = 0;
        Double x = Math.sqrt(n);
        if(x == x.intValue()){
            answer = (long)Math.pow(x+1, 2);
        }else{
            answer = -1;
        }



        return answer;
    }

    public static void main(String[] args) {

        정수_제곱근_판별1 a = new 정수_제곱근_판별1();

        long n = 123;
        a.solution(n);
    }
}
