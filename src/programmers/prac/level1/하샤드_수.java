package programmers.prac.level1;

public class 하샤드_수 {

    public boolean solution(int x) {
        String str = String.valueOf(x);
        int value = 0;
        for (int i = 0; i < str.length(); i++) {
            value += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        if(x%value == 0){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {

        하샤드_수 a = new 하샤드_수();
        int x = 12;
       
        a.solution(x);
    }
}
