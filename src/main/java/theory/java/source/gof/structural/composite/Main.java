package theory.java.source.gof.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName    : theory.java.source.gof.structural.composite
 * fileName       : Main
 * author         : caprocoo
 * date           : 2023-02-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-02-03        caprocoo       최초 생성
 */
public class Main {
    public static void main(String[] args) {

        // Leaf 1
        Ellipse ellipse1 = new Ellipse();
        Ellipse ellipse2 = new Ellipse();

        // Leaf 2
        Ellipse2 ellipse3 = new Ellipse2();
        Ellipse2 ellipse4 = new Ellipse2();


        CompositeGraphic graphic1 = new CompositeGraphic();
        CompositeGraphic graphic2 = new CompositeGraphic();
        CompositeGraphic graphic3 = new CompositeGraphic();


        graphic2.add(ellipse1);
        graphic2.add(ellipse2);
        graphic2.add(ellipse3);

        graphic3.add(ellipse4);

        graphic1.add(graphic2);
        graphic1.add(graphic3);

        graphic1.print();


    }
}

// Component
interface Graphic{
    void print();
}

// Leaf
class Ellipse implements Graphic {

    @Override
    public void print() {
        System.out.println("Ellipse");
    }
}

// Leaf
class Ellipse2 implements Graphic {

    @Override
    public void print() {
        System.out.println("Ellipse2");
    }
}

// Composite
class CompositeGraphic implements Graphic {

    private List<Graphic> childGraphics = new ArrayList<>();

    @Override
    public void print() {
        for (Graphic graphic: childGraphics) {
            graphic.print();
        }
    }

    public void add(Graphic graphic) {
        childGraphics.add(graphic);
    }

    public void remove(Graphic graphic) {
        childGraphics.remove(graphic);
    }
}
