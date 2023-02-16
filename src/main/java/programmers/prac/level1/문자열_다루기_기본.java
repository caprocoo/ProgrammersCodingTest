package programmers.prac.level1;


public class 문자열_다루기_기본 {

    public boolean solution(String s) {
        if(s.length()==4 || s.length()==6){
            if(s.chars().allMatch(Character::isDigit)) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {

        문자열_다루기_기본 a = new 문자열_다루기_기본();

//        String s = "a234";
        String s = "1234";

        a.solution(s);
    }
}
