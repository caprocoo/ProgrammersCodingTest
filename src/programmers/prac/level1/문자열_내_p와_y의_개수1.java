package programmers.prac.level1;

import java.util.Locale;

public class 문자열_내_p와_y의_개수1 {

    boolean solution(String s) {

        int []arr = new int[2];
        String lowerCase = s.toLowerCase(Locale.ROOT);
        for (int i = 0; i < lowerCase.length(); i++) {
            if(lowerCase.charAt(i) == 'p'){
                arr[0]++;
            }
            if(lowerCase.charAt(i) == 'y'){
                arr[1]++;
            }
        }
//        if(arr[0]==arr[1]){
//            return true;
//        }else{
//            return false;
//        }
        return arr[0]==arr[1];

    }


    public static void main(String[] args) {

        문자열_내_p와_y의_개수1 a = new 문자열_내_p와_y의_개수1();

        String s = "pPoooyY";
        a.solution(s);
    }
}
