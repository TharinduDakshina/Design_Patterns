package cretional_patterns.factory;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        Shape circle=new ShapeFactory().getShape("circle");
        circle.draw();

        Shape rectangle=new ShapeFactory().getShape("rectangle");
        rectangle.draw();

        Shape square=new ShapeFactory().getShape("square");
        square.draw();
    }
}
