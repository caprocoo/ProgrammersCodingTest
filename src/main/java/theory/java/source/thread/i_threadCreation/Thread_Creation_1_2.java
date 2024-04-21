package theory.java.source.thread.i_threadCreation;

/**
 * packageName    : theory.java.source.thread
 * fileName       : Thread_Creation_1
 * author         : caprocoo
 * date           : 2023-09-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-18        caprocoo       최초 생성
 */
public class Thread_Creation_1_2 {

    public static void main(String[] args) {

        // 람다식을 통한 Runnable 익명 객체 구현
        Runnable task = () ->{
            int sum = 0;

            for (int i = 0; i < 10; i++) {
                sum += i;
                System.out.println(sum);
            }
            System.out.println(Thread.currentThread().getName() + ", 최종 합 : " + sum);

        };
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        // Thread 이름 지정
        t1.setName("Thread 1");
        t2.setName("Thread 2");

        t1.start();
        t2.start();
    }

}
