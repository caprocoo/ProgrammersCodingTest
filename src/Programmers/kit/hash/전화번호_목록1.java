package Programmers.kit.hash;

import java.util.Arrays;

public class 전화번호_목록1 {
    public boolean solution(String[] phone_book){

        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length; i++) {
            if(phone_book[i+1].startsWith(phone_book[i])){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        전화번호_목록1 a = new 전화번호_목록1();
        String [] phone_book = {"12","123","1235","567","88"};
        a.solution(phone_book);
    }
}
