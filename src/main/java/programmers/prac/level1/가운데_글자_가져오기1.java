package programmers.prac.level1;

public class 가운데_글자_가져오기1 {

    public String solution(String s) {

        String answer = "";
        if(s.length()%2==0){
            answer+=s.charAt((s.length()/2)-1);
            answer+=s.charAt((s.length()/2));
        }else{
            answer+=s.charAt((s.length()/2));
        }

        return answer;
    }


    public static void main(String[] args) {

        가운데_글자_가져오기1 a = new 가운데_글자_가져오기1();

        String s = "abcde";
//        String s = "qwer";

        a.solution(s);
    }
}
