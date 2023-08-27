package cretional_patterns.abstractFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if (choice == null) {
            return null;
        } else if (choice.equalsIgnoreCase("Shape")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("Colour")){
            return new ColourFactory();
        }
        return null;
    }
}
