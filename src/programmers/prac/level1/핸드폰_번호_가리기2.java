package programmers.prac.level1;

public class 핸드폰_번호_가리기2 {

    public String solution(String phone_number) {

        char[] ch = phone_number.toCharArray();
        for (int i = 0; i < ch.length-4; i++) {
            ch[i] = '*';

        }
        return String.valueOf(ch);
    }

    public static void main(String[] args) {

        핸드폰_번호_가리기2 abc = new 핸드폰_번호_가리기2();

        String p = "01033334444";

        abc.solution(p);
    }
}
