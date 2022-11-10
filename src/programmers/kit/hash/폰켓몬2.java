package programmers.kit.hash;

import java.util.Arrays;

public class 폰켓몬2 {

    public int solution(int[] nums) {

        int answer = 0;
        int[] ad = Arrays.stream(nums).distinct().toArray();
        answer = ad.length<nums.length/2 ? ad.length : nums.length/2;

        return answer;

    }

    public static void main(String[] args) {
        폰켓몬2 p = new 폰켓몬2();
//        int[] nums = {3,3,3,2,2,2};
//        int[] nums = {3,3,3,2,2,4};
        int[] nums = {1, 2, 3, 4, 5, 5,7,7,7};


        p.solution(nums);
    }
}
