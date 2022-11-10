package programmers.prac.level2;

class 이진_변환_반복하기 {
    public int[] solution(String s) {

        int [] answer = new int[2];

        while(!s.equals("1")){
            answer[0]++;
            String str = s.replaceAll("0", "");
            answer[1]+=s.length()-str.length();
            s = Integer.toBinaryString(str.length());
        }

        return answer;
    }
    public static void main(String[] args) {

        이진_변환_반복하기 solution = new 이진_변환_반복하기();

        String s = "110010101001";
//        String s = "0111010";

        solution.solution(s);


    }
}