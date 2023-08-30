package structural_patterns.Decorator_pattern;

public class SportCar extends CarDecorator{
    public SportCar(Car c) {
        super(c);
    }

    @Override
    public void assemble(){
        this.car.assemble();
    }
}
