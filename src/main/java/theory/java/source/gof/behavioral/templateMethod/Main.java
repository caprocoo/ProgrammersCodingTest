package theory.java.source.gof.behavioral.templateMethod;

/**
 * packageName    : theory.java.source.gof.behavioral.templateMethod
 * fileName       : Main
 * author         : caprocoo
 * date           : 2023-01-31
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-31        caprocoo       최초 생성
 */
public class Main {
    public static void main(String[] args) {
        HouseTemplate houseType = new WoodenHouse();
        houseType.buildHouse();

        System.out.println("************");

        houseType = new GlassHouse();
        houseType.buildHouse();
    }
}

abstract class HouseTemplate{
    
    // final 선언으로 Override 방지
    public final void buildHouse(){
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is built.");
    }
    
    // 기본으로 구현
    private void buildFoundation() {
        System.out.println("Building foundation with cement,iron rods and sand");
    }
    private void buildWindows() {
        System.out.println("Building Glass Windows");
    }
    
    // 서브 클래스에서 직접 구현할 메서드
    public abstract void buildWalls();
    public abstract void buildPillars();
    
}

class GlassHouse extends HouseTemplate{

    @Override
    public void buildWalls() {
        System.out.println("Building Glass Walls");
    }

    @Override
    public void buildPillars() {
        System.out.println("Building Pillars with glass coating");
    }
}

class WoodenHouse extends HouseTemplate{

    @Override
    public void buildWalls() {
        System.out.println("Building Wooden Walls");
    }

    @Override
    public void buildPillars() {
        System.out.println("Building Pillars with Wood coating");
    }
}