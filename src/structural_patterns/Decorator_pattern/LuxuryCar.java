package structural_patterns.Decorator_pattern;

public class LuxuryCar extends CarDecorator{
    public LuxuryCar(Car c) {
        super(c);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding features of luxury Car.");
    }
}
