package programmers.prac.level1;

public class 수박수박수박수박수박수 {

    public String solution(int n) {

        String answer = "";
        for (int i = 1; i <= n; i++) {
            if(i%2==1){
                answer+="수";
            }else{
                answer+="박";
            }

            //삼항연산자 이용 로직
//            answer+=i%2==1?"수":"박";
        }
        return answer;
    }


    public static void main(String[] args) {

        수박수박수박수박수박수 a = new 수박수박수박수박수박수();

        int s = 3;

        a.solution(s);
    }
}
