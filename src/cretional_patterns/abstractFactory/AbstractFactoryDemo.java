package cretional_patterns.abstractFactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");

        Shape circle = shapeFactory.getShape("Circle");
        circle.draw();

        Shape square = shapeFactory.getShape("Square");
        square.draw();

        AbstractFactory colourFactory = FactoryProducer.getFactory("Colour");

        Colour red = colourFactory.geColour("Red");
        red.fill();

        Colour blue = colourFactory.geColour("blue");
        blue.fill();
    }
}
