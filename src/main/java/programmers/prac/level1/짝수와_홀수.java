package programmers.prac.level1;

public class 짝수와_홀수 {

    public String solution(int num) {
        String answer = "";

        System.out.println("num%2 = " + num%2);
        if(num%2==0){
            answer = "Even";
        }else{
            answer = "Odd";
        }


        return answer;
    }

    public static void main(String[] args) {

        짝수와_홀수 a = new 짝수와_홀수();

        int num = 100;
//        int num = 4;
        a.solution(num);
    }
}
