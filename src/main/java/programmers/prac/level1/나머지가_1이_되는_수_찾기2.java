package programmers.prac.level1;

public class 나머지가_1이_되는_수_찾기2 {

    public int solution(int n) {

        int answer = 1;

        while(true){
            if(n%answer ==1){
                break;
            }
            answer++;
        }

        return answer;
    }


    public static void main(String[] args) {

        나머지가_1이_되는_수_찾기2 a = new 나머지가_1이_되는_수_찾기2();
        int n = 12;
        a.solution(n);
    }
}
