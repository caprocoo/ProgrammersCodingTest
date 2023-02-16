package programmers.prac.level1;

public class 가운데_글자_가져오기2 {

    public String solution(String s) {

        System.out.println("(s.length()-1)/2 = " + (s.length()-1)/2);
        System.out.println("s.length()/2+1 = " + (s.length()/2+1));
        System.out.println("s.substring((s.length()-1)/2, s.length()/2+1) = " + s.substring((s.length()-1)/2, s.length()/2+1));
        
        return s.substring((s.length()-1)/2, s.length()/2+1);
    }


    public static void main(String[] args) {

        가운데_글자_가져오기2 a = new 가운데_글자_가져오기2();

        String s = "abcde";
//        String s = "qwer";

        a.solution(s);
    }
}
