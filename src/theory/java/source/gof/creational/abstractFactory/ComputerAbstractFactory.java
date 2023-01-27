package theory.java.source.gof.creational.abstractFactory;


// 1)
public interface ComputerAbstractFactory {

    // 주의 깊게 봐야할 것은 createComputer() 메서드의 리턴 타입이 Computer라는 점이다.
    // 이 팩토리 인터페이스를 구현하는 클래스에서 createComputer() 메서드를 오버라이딩하여 각각의 서브 클래스를 리턴해줄 것이다.
    public Computer createComputer();
}

// 3)
// 이 서브 클래스들을 생성하기 위해 클라이언트 코드에 접점으로 제공되는 컨슈머 클래스
class ComputerFactory{

    // getComputer()라는 static 메서드에 앞서 PCFactory 혹은 ServerFactory 인스턴스를 넣어줌으로써
    // if-else 없이도 각각 원하는 서브 클래스의 인스턴스를 생성할 수 있다.
    public static Computer getComputer(ComputerAbstractFactory computerAbstractFactory){
        return computerAbstractFactory.createComputer();
    }
}

// 2)
// sub class - server 에 대한 팩토리 클래스
class ServerFactory implements ComputerAbstractFactory {

    private String ram;
    private String hdd;
    private String cpu;

    public ServerFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer createComputer() {
        return new Server(ram, hdd, cpu);
    }
}
// 2)
// sub class - pc 에 대한 팩토리 클래스
class PCFactory implements ComputerAbstractFactory {

    private String ram;
    private String hdd;
    private String cpu;

    public PCFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer createComputer() {
        return new PC(ram, hdd, cpu);
    }
}

