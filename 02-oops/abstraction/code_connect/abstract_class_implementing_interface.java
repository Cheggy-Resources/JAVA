
interface abs_int{
    void display();
    void helloNamste();
}

abstract class abstract_class2 implements abs_int{
    public void helloNamste() {
        System.out.println("Hello, Namaste!");
    }
}

class class3 extends abstract_class2 {
    public void display() {
        System.out.println("This is the implementation of the display method in class3.");
    }
}

public class abstract_cls_interface {
    public static void main(String[] args) {
        abs_int obj = new class3();
        obj.display();
        obj.helloNamste();
    }
}
