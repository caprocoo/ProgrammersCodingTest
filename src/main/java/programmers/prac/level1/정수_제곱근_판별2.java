package programmers.prac.level1;

public class 정수_제곱근_판별2 {

    public long solution(long n) {

        if( Math.pow((int)Math.sqrt(n),2)==n){

            return (long) Math.pow(Math.sqrt(n)+1,2);

        }
        return -1;
    }


    public static void main(String[] args) {

        정수_제곱근_판별2 a = new 정수_제곱근_판별2();

        long n = 123;
        a.solution(n);
    }
}
