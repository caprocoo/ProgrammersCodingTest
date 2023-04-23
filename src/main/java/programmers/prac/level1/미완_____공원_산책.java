package programmers.prac.level1;

import java.util.Arrays;

/**
 * packageName    : programmers.prac.level1
 * fileName       : 공원_산책
 * author         : caprocoo
 * date           : 2023-04-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-04-26        caprocoo       최초 생성
 */
public class 미완_____공원_산책 {
    public static void main(String[] args) {
        미완_____공원_산책 a = new 미완_____공원_산책();
        String[] park = {"OSO","OOO","OXO","OOO"};
        String[] routes = {"E 2","S 3","W 1"};

        a.solution(park, routes);


    }
    public int[] solution(String[] park, String[] routes) {
//       result = [2,1]
        int[] answer = new int[2];
        for (int i = 0; i < routes.length; i++) {
            if(!park[i].contains("X")){
                if(routes[i].charAt(0) == 'E'){
                    answer[1] += Character.getNumericValue(routes[i].charAt(routes[i].length() - 1));
                    System.out.println("E " + Arrays.toString(answer));
                }
                else if(routes[i].charAt(0) == 'S'){
                    answer[0] += Character.getNumericValue(routes[i].charAt(routes[i].length() - 1));
                    System.out.println("S " + Arrays.toString(answer));
                }
                else if(routes[i].charAt(0) == 'N'){
                    answer[0] -= Character.getNumericValue(routes[i].charAt(routes[i].length() - 1));
                    System.out.println("N " + Arrays.toString(answer));
                }
                else if(routes[i].charAt(0) == 'W'){
                    answer[1] -= Character.getNumericValue(routes[i].charAt(routes[i].length() - 1));
                    System.out.println("W " + Arrays.toString(answer));
                }
            }
        }
        System.out.println(Arrays.toString(answer));

        return answer;
    }
}
