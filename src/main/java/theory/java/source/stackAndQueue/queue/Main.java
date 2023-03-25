package theory.java.source.stackAndQueue.queue;
import java.util.LinkedList; //import
import java.util.Queue; //import
public class Main {
    public static void main(String[] args) {

        // 1. 선언
        // 큐는 LinkedList를 활용하여 생성해야 한다.
        Queue<Integer> queue = new LinkedList<>(); //int형 queue 선언, linkedlist 이용
        Queue<String> queue2 = new LinkedList<>(); //String형 queue 선언, linkedlist 이용

        // 2. 값 추가
        // 값을 추가하고 싶으면 add(value), offer(value) 라는 메서드를 활용한다.
        // add 함수는 성공하면 true, 실패하면 IllegalStateException 을 발생시킨다.
        Queue<Integer> stack = new LinkedList<>(); //int형 queue 선언
        queue.add(1);     // queue에 값 1 추가
        queue.add(2);     // queue에 값 2 추가
        queue.offer(3);   // queue에 값 3 추가

        // 3. 값 삭제
        // 값을 제거하고 싶으면 poll() 이나 remove() 라는 메서드를 활용한다.
        // poll() 함수는 큐가 비어있으면 null 을 반환하고 clear() 메서드는 모든 요소를 제거한다.
        queue.poll();       // queue에 첫번째 값을 반환하고 제거 비어있다면 null
        queue.remove();     // queue에 첫번째 값 제거
        queue.clear();      // queue 초기화

        // 4. 가장 먼저 들어간 값 출력
        queue.peek();       // queue의 첫번째 값 참조


    }
}
