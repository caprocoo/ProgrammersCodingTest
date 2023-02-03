package theory.java.source.gof.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName    : theory.java.source.gof.structural.composite
 * fileName       : Main2
 * author         : caprocoo
 * date           : 2023-02-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-02-03        caprocoo       최초 생성
 */
public class Main2 {
    public static void main(String[] args) {
        Shape triangle = new Triangle();
        Shape triangle2 = new Triangle();
        Shape circle = new Circle();

        Drawing drawing = new Drawing();
        drawing.add(triangle);
        drawing.add(triangle2);
        drawing.add(circle);

        drawing.draw("RED");

        List<Shape> shapes = new ArrayList<>();
        shapes.add(drawing);
        shapes.add(new Triangle());
        shapes.add(new Circle());

        for (Shape shape : shapes) {
            shape.draw("GREEN");
        }

    }
}
interface Shape{
    void draw(String fillColor);
}

class Triangle implements Shape {

    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Triangle with color " + fillColor);
    }
}

class Circle implements Shape {

    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Circle with color "+fillColor);
    }
}

class Drawing implements Shape {

    private List<Shape> shapes = new ArrayList<>();

    @Override
    public void draw(String fillColor) {
        for (Shape sh: shapes) {
            sh.draw(fillColor);
        }
    }

    public void add(Shape shape) {
        this.shapes.add(shape);
    }

    public void remove(Shape shape) {
        this.shapes.remove(shape);
    }
    public void clear(){
        System.out.println("Clearing all the shapes from drawing");
        this.shapes.clear();
    }


}



