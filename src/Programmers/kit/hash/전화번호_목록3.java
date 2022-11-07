package Programmers.kit.hash;

public class 전화번호_목록3 {
    public boolean solution(String[] phone_book){
        for(int i=0; i<phone_book.length-1; i++) {
            for(int j=i+1; j<phone_book.length; j++) {
                if(phone_book[i].startsWith(phone_book[j])) {
                    return false;
                }
                if(phone_book[j].startsWith(phone_book[i])) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        전화번호_목록3 a = new 전화번호_목록3();
//        String [] phone_book = {"12","123","1235","567","88"};
        String [] phone_book = {"12","123","1235","567","88"};
        System.out.println(a.solution(phone_book));
    }
}
