package structural_patterns.bridge;

public class Triangle extends Shape {
    public Triangle(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.print("Triangle fill with color ");
        color.applyColor();
    }
}
