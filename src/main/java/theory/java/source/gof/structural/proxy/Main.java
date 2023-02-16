package theory.java.source.gof.structural.proxy;

/**
 * packageName    : theory.java.source.gof.structural.proxy
 * fileName       : Main
 * author         : caprocoo
 * date           : 2023-02-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-02-06        caprocoo       최초 생성
 */
public class Main {
    public static void main(String[] args) {
        IService proxy = new Proxy();
        System.out.println(proxy.runSomething());

    }
}

interface IService{
    String runSomething();

}

class Service implements IService {

    @Override
    public String runSomething() {
        return "서비스 돌아감";
    }
}

class Proxy implements IService {
    IService service1;

    @Override
    public String runSomething() {
        System.out.println("호출에 대한 흐름 제어가 목적이다, 반환 결과를 그대로 전달한다.");
        service1 = new Service();
        return service1.runSomething();
    }

}