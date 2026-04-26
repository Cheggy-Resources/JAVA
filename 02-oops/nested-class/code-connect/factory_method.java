public class factory_method {
    int x; 
    private factory_method(){
        x = 10;
    }
    public static factory_method getInstance(){
        return new factory_method();
    }
}
