package cretional_patterns.factory;

public class FactoryPatternDemo {
    public static void main(String[] args) {

        Shape circle=ShapeFactory.getInstance().getShape("circle");
        circle.draw();

        Shape rectangle=ShapeFactory.getInstance().getShape("rectangle");
        rectangle.draw();

        Shape square=ShapeFactory.getInstance().getShape("square");
        square.draw();
    }
}
