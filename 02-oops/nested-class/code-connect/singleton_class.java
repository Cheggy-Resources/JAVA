public class singleton_class {
    int x; 
    private static singleton_class obj = new singleton_class();
    private singleton_class(){
        x = 10;
    }
    public static singleton_class getInstance(){
        return obj;
    }
}

