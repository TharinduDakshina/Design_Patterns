package cretional_patterns.prototype;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCash();

        Shape conedShape = ShapeCache.getShape("1");
        System.out.println("Shape : "+conedShape.getType());

        Shape conedShape2=ShapeCache.getShape("2");
        System.out.println("Shape : "+conedShape2.getType());


    }
}
