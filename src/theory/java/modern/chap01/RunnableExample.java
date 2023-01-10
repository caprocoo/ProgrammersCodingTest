package theory.java.modern.chap01;

import java.util.Arrays;

/**
 * packageName    : theory.java.modern.chap01
 * fileName       : RunnableExample
 * author         : caprocoo
 * date           : 2023-01-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-10        caprocoo       최초 생성
 */
public class RunnableExample {
    public static void main(String[] args) {

        Runnable print100 = new PrintNum(100);

        Thread t1 = new Thread(print100);
        Thread t2 = new Thread(print100);

        t1.start();
        t2.start();



    }

    static class PrintNum implements Runnable{
        private int lastNum;

        public PrintNum(int lastNum) {
            this.lastNum = lastNum;
        }

        @Override
        public void run() {
            //0부터 입력받은 n까지의 수를 출력한다.
            for (int i = 0; i <=lastNum; i++) {
                System.out.println(" "+ i);
            }
        }
    }
}
