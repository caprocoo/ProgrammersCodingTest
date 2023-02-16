package theory.java.source.gof.behavioral.memento;

import java.util.Stack;

/**
 * packageName    : theory.java.source.gof.behavioral.memento
 * fileName       : Main
 * author         : caprocoo
 * date           : 2023-02-14
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-02-14        caprocoo       최초 생성
 */
public class Main {
    public static void main(String[] args) {
        Information information = new Information("data1", 10);
        CareTaker careTaker = new CareTaker();
        // 현재 information의 상태 정보를 가지는 Memento를 생성하여 CareTaker에 추가한다.
        careTaker.push(information.CreateMemento());

        information.setData1("data2");
        information.setData2(20);

        System.out.println("현재 data1 : " + information.getData1());
        System.out.println("현재 data2 : " + information.getData2());

        information.RestoreMemento(careTaker.pop());

        System.out.println("복구된 data1 : " + information.getData1());
        System.out.println("복구된 data2 : " + information.getData2());


    }
}

// Originator
class Information{
    private String data1;
    private int data2;

    public Information(String data1, int data2) {
        this.data1 = data1;
        this.data2 = data2;
    }

    public Memento CreateMemento(){
        return new Memento(data1, data2);
    }

    public void RestoreMemento(Memento memento) {
        this.data1 = memento.getData1();
        this.data2 = memento.getData2();
    }

    public void setData1(String data1) {
        this.data1 = data1;
    }

    public void setData2(int data2) {
        this.data2 = data2;
    }

    public String getData1() {
        return data1;
    }

    public int getData2() {
        return data2;
    }
}

// Memento
class Memento{
    private String data1;
    private int data2;

    public Memento(String data1, int data2) {
        this.data1 = data1;
        this.data2 = data2;
    }

    public String getData1() {
        return data1;
    }

    public int getData2() {
        return data2;
    }
}

// CareTaker
class CareTaker{
    Stack<Memento> mementos = new Stack<>();

    public void push(Memento memento) {
        mementos.push(memento);
    }
    public Memento pop(){
        return mementos.pop();
    }

}
