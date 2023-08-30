package structural_patterns.bridge;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(new RedColor());
        triangle.applyColor();

        Circle circle = new Circle(new GreenColor());
        circle.applyColor();
    }
}
