package structural_patterns.bridge;

public class Circle extends Shape{
    public Circle(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.print("Circle filled width color ");
        color.applyColor();
    }
}
