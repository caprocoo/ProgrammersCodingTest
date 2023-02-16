package programmers.kit.hash;

import java.util.HashMap;

public class 전화번호_목록2 {
    public boolean solution(String[] phone_book){

        boolean answer = true;
        HashMap<String, Integer> hash = new HashMap<>();
        for (int i = 0; i < phone_book.length; i++) {
            hash.put(phone_book[i], i);
        }

        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 0; j < phone_book[i].length(); j++) {
                if(hash.containsKey(phone_book[i].substring(0,j))){
                    return false;
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        전화번호_목록2 a = new 전화번호_목록2();
//        String [] phone_book = {"12","123","1235","567","88"};
        String [] phone_book = {"123","456","789"};
        System.out.println(a.solution(phone_book));
    }
}
