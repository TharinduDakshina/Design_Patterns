package cretional_patterns.prototype;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String,Shape> shapeMap=new Hashtable<String,Shape>();

    public static Shape getShape(String shapeId){
        Shape cashShape=shapeMap.get(shapeId);
        return (Shape) cashShape.clone();
    }


    public static void loadCash(){
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(),rectangle);
    }
}
