package theory.java.source.gof.structural.bridge;

/**
 * packageName    : theory.java.source.gof.structural.bridge
 * fileName       : Main
 * author         : caprocoo
 * date           : 2023-02-02
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-02-02        caprocoo       최초 생성
 */
public class Main {
    public static void main(String[] args) {
        Brush redBrush = new HBPencil(new Red());
        System.out.println(redBrush.draw());
        Brush blueBrush = new MonoLine(new Blue());
        System.out.println(blueBrush.draw());


    }
}

interface Color{
    String fill();
}

class Red implements Color {

    @Override
    public String fill() {
        return "빨간색";
    }
}

class Blue implements Color {

    @Override
    public String fill() {
        return "파란색";
    }
}

abstract class Brush{
    protected Color color;

    protected Brush(Color color) {
        this.color = color;
    }

    public abstract String draw();
}

class HBPencil extends Brush {

    public static final String type = "[HB Pencil]";

    public HBPencil(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return type + " " + color.fill();
    }
}
class MonoLine extends Brush {

    public static final String type = "[MonoLine]";

    public MonoLine(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return type + " " + color.fill();
    }
}