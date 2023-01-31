package theory.java.source.gof.creational.factoryMethod;

import java.util.zip.DeflaterOutputStream;

/**
 * packageName    : theory.java.source.gof.creational.factoryMethod
 * fileName       : Main2
 * author         : caprocoo
 * date           : 2023-01-31
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-31        caprocoo       최초 생성
 */

interface Shape{
    void draw();
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle - draw() Method..");
    }
}

class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle - draw() Method..");
    }
}

class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square - draw() Method..");
    }
}

class ShapeFactory{
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}




public class Main2 {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();

    }
}



