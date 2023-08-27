package cretional_patterns.abstractFactory;

public class ColourFactory extends AbstractFactory{
    @Override
    Colour geColour(String colour) {
        if (colour == null) {
            return null;
        } else if (colour.equalsIgnoreCase("Red")) {
            return new Red();
        } else if (colour.equalsIgnoreCase("Blue")) {
            return new Blue();
        }
        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
