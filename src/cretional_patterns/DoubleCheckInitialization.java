package cretional_patterns;

public class DoubleCheckInitialization {
    private static volatile DoubleCheckInitialization instance=null;

    private DoubleCheckInitialization(){}

    public static DoubleCheckInitialization getInstance(){
        if (instance==null){
            synchronized (DoubleCheckInitialization.class){
                if (instance==null){
                    instance=new DoubleCheckInitialization();
                }
            }
        }
        return instance;
    }

    public String getMessage(){
        return "Double-checked locking initialization is successful.";
    }
}
