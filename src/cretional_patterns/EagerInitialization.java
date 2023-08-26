package cretional_patterns;

public class EagerInitialization {
    private static final EagerInitialization instance=new EagerInitialization();

    private EagerInitialization(){}

    public static EagerInitialization getInstance(){
        return instance;
    }

    public String getMessage(){
        return "Eager initialization is successful.";
    }
}
