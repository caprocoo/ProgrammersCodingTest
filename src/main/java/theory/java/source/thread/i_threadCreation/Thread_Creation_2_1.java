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
public class Thread_Creation_2_1 extends Thread {

    public static void main(String[] args) {
        // Thread 상속 객체 생성
        Thread t1 = new Thread_Creation_2_1();
        
        // Thread 익명 객체 생성
        Thread t2 = new Thread(() -> {
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
                System.out.println(sum);
            }
            System.out.println(Thread.currentThread() + "최종 합 : " + sum);
        });

        t1.start();
        t2.start();
    }

    @Override
    public void run() {

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
            System.out.println(sum);
        }
        System.out.println(Thread.currentThread() + "최종 합 : " + sum);

    }
}



