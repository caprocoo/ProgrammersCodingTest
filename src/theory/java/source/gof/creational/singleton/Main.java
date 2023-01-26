package theory.java.source.gof.creational.singleton;

public class Main {


    public static void main(String[] args) {
        Wifi wifi1 = Wifi.requestWifi();    // 와이파이 요청 1
        Wifi wifi2 = Wifi.requestWifi();    // 와이파이 요청 2
        Wifi wifi3 = Wifi.requestWifi();    // 와이파이 요청 3
        System.out.println(wifi1);
        System.out.println(wifi2);
        System.out.println(wifi3);
        //상위 3개의 요청 결과 모두 같은 와이파이 정보임을 알 수 있다.
    }


}
