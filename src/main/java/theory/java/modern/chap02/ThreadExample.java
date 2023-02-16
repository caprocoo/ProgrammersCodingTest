package theory.java.modern.chap02;

/**
 * packageName    : theory.java.modern.chap01
 * fileName       : ThreadExample
 * author         : caprocoo
 * date           : 2023-01-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-10        caprocoo       최초 생성
 */
public class ThreadExample {
    public static void main(String[] args) {

        PrintChar t1 = new PrintChar('A', 10);
        PrintChar t2 = new PrintChar('B', 10);
        t1.start();
        t2.start();



    }

    static class PrintChar extends Thread{
        private char charToPrint;
        private int times;

        public PrintChar(char charToPrint, int times) {
            this.charToPrint = charToPrint;
            this.times = times;
        }
        @Override
        public void run(){
            for (int i = 0; i < times; i++) {
                System.out.println(charToPrint);
            }
        }
    }
}
