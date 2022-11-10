package programmers.kit.hash;

import java.util.ArrayList;
import java.util.List;

public class 폰켓몬1 {

    public int solution(int[] nums) {

        List<Integer> list = new ArrayList<>();
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            if(!list.contains(nums[i])){
                list.add(nums[i]);
            }
        }
        answer = (list.size()<nums.length/2) ? list.size() : nums.length/2;

        return answer;

    }

    public static void main(String[] args) {
        폰켓몬1 p = new 폰켓몬1();
//        int[] nums = {3,3,3,2,2,2};
//        int[] nums = {3,3,3,2,2,4};
        int[] nums = {1, 2, 3, 4, 5, 5,7,7,7};


        p.solution(nums);
    }
}
