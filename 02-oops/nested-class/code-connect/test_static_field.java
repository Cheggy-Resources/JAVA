public class test_static_field {
    public static void main(String[] args) {
        static_field obj1 = static_field.obj;
        static_field obj2 = static_field.obj;
        obj1.x = 20;
        obj2.x = 30;
        System.out.println(obj1.x);
        System.out.println(obj2.x);
    }
}
