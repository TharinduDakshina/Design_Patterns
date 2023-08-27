package cretional_patterns.abstractFactory;

public class ShapeFactory extends AbstractFactory{
    @Override
    Colour geColour(String colour) {
        return null;
    }

    @Override
    Shape getShape(String shape) {
        if (shape == null) {
            return null;
        } else if (shape.equalsIgnoreCase("Circle")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("Square")) {
            return new Square();
        }
        return null;
    }
}
