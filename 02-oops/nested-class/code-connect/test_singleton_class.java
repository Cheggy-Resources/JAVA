public class test_singleton_class {
    public static void main(String[] args) {
        singleton_class obj1 = singleton_class.getInstance();
        singleton_class obj2 = singleton_class.getInstance();
        obj1.x = 20;
        obj2.x = 30;
        System.out.println(obj1.x);
        System.out.println(obj2.x);
    }
}
