package programmers.prac.level2;

/**
 * packageName    : programmers.prac.level2
 * fileName       : 행렬의_곱셈
 * author         : caprocoo
 * date           : 2023-04-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-04-27        caprocoo       최초 생성
 */
public class 행렬의_곱셈 {
    public static void main(String[] args) {
        int[][] arr1 = {{2, 3, 2},
                        {4, 2, 4}};
        int[][] arr2 = {{5, 4},
                        {2, 4},
                        {3, 1}};

        // 행의 개수
        System.out.println(arr1.length);
        System.out.println(arr2.length);

        System.out.println(arr1[0].length);
        System.out.println(arr2[0].length);

    }

    public int[][] solution(int[][] arr1, int[][] arr2) {


        int[][] answer = new int[arr1.length][arr2[0].length];
        for(int i = 0 ; i < arr1.length ; ++i){ //2
            for(int j = 0 ; j < arr2[0].length ; ++j){  //2
                for(int k = 0 ; k < arr1[0].length ; ++k) { //3
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }



        return answer;
    }
}
