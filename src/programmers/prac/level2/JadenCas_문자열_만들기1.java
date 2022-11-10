package programmers.prac.level2;

class JadenCas_문자열_만들기1 {
    public String solution(String s) {

        String answer= "";

        String [] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length() == 0){
                answer += " ";
            }else{
                answer += arr[i].substring(0,1).toUpperCase();
                answer += arr[i].substring(1).toLowerCase();
                answer += " ";
            }
        }
        if(s.substring(s.length()-1).equals(" ")){
            return answer;
        }



        return answer.substring(0, answer.length()-1);
    }
    public static void main(String[] args) {

        JadenCas_문자열_만들기1 solution = new JadenCas_문자열_만들기1();
        String s = "3people unFollowed me";
//        String s = "for the last week";


        solution.solution(s);


    }
}