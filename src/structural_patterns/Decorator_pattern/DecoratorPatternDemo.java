package structural_patterns.Decorator_pattern;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Car sportCar = new SportCar(new BasicCar());
        sportCar.assemble();
        System.out.println("\n*****");

        Car sportCar1 = new SportCar(new LuxuryCar(new BasicCar()));
        sportCar1.assemble();
    }
}
