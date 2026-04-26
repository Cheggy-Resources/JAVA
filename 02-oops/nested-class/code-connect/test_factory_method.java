public class test_factory_method {
    public static void main(String[] args) {
        factory_method obj1 = factory_method.getInstance();
        factory_method obj2 = factory_method.getInstance();
        obj2.x = 20; 
        obj1.x = 30;
        System.out.println(obj1.x);
        System.out.println(obj2.x);
    }
}
