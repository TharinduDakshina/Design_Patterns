package cretional_patterns.factory;

public class ShapeFactory {


    //singleton pattern
    private static ShapeFactory instance=null;

    private ShapeFactory(){}

    public static ShapeFactory getInstance(){
        if (instance==null){
            instance=new ShapeFactory();
        }
        return instance;
    }


    //Factory pattern
    public Shape getShape(String shapeType){
        if (shapeType==null){
            return null;
        } else if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("square")) {
            return new Square();
        }
        return null;
    };
}
