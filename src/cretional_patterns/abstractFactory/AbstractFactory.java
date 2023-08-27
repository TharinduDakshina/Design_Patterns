package cretional_patterns.abstractFactory;

public abstract class AbstractFactory {
    abstract Colour geColour(String colour);
    abstract Shape getShape(String shape);
}
