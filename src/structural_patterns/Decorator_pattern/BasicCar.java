package structural_patterns.Decorator_pattern;

public class BasicCar implements Car{
    @Override
    public void assemble() {
        System.out.println("Basic Car");
    }
}
