package programmers.prac.level2;

import java.util.Arrays;

public class 구명보트 {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int index = 0;
        Arrays.sort(people);
        System.out.println(Arrays.toString(people));
        for (int i = people.length-1; i >=index ; i--) {
            if(people[i] + people[index] <=limit){
                index++;
            }
            answer++;
        }
        return answer;
    }



    public static void main(String[] args) {
        구명보트 g = new 구명보트();

        int [] people = {70, 50, 80, 50};
        int limit = 100;
        g.solution(people, limit);
    }
}
