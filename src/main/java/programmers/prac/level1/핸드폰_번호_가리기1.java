package programmers.prac.level1;

import java.util.Arrays;

public class 핸드폰_번호_가리기1 {

    public String solution(String phone_number) {
        String star = phone_number.substring(0,phone_number.length()-4).replaceAll(".", "*") + phone_number.substring(phone_number.length()-4);
        return star;
    }

    public static void main(String[] args) {

        핸드폰_번호_가리기1 abc = new 핸드폰_번호_가리기1();

        String p = "01033334444";

        abc.solution(p);
    }
}
