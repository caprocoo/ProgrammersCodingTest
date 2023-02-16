package programmers.prac.level1;

public class 콜라츠_추측 {

    public int solution(int num) {
        int answer = 0;
        while(num!=1 && answer<500){
            if(num%2==0){
                num = num/2;

            }else if(num%2==1){
                num = (num*3)+1;
            }
            answer++;
            if(answer==500){
                answer=-1; break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        콜라츠_추측 abc = new 콜라츠_추측();
        int a = 626331;
        abc.solution(a);
    }
}
