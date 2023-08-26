package cretional_patterns.singleton;

public class singletonPattern {
    public static void main(String[] args) {
        //Eager initialization
        EagerInitialization eagerObject=EagerInitialization.getInstance();
        System.out.println(eagerObject.getMessage()+"\n");

        //Lazy initialization
        LazyInitialization lazyObject=LazyInitialization.getInstance();
        System.out.println(lazyObject.getMessage()+"\n");

        //Double-check locking initialization
        DoubleCheckInitialization dclObject=DoubleCheckInitialization.getInstance();
        System.out.println(dclObject.getMessage());
    }
}



