package cretional_patterns.Builder;

public abstract class Bugger implements Item{

    @Override
    public Packing packing() {
        return new Wapper();
    }

    @Override
    public abstract float price();
}
