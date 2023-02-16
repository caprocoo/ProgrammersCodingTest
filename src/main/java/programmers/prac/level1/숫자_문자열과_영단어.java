package programmers.prac.level1;


import java.util.HashMap;

public class 숫자_문자열과_영단어 {

    public int solution(String s) {

        HashMap<String, String> hash = new HashMap<>();
        hash.put("zero", "0");
        hash.put("one", "1");
        hash.put("two", "2");
        hash.put("three", "3");
        hash.put("four", "4");
        hash.put("five", "5");
        hash.put("six", "6");
        hash.put("seven", "7");
        hash.put("eight", "8");
        hash.put("nine", "9");

        for(String a: hash.keySet()){
            if(s.contains(a)){
                s = s.replaceAll(a, hash.get(a));
            }
        }
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {

        숫자_문자열과_영단어 a = new 숫자_문자열과_영단어();

        String s = "one4seveneight";
        a.solution(s);
    }
}
