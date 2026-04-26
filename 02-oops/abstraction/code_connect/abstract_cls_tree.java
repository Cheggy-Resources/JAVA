abstract class special1 {
    abstract void display();
    abstract void helloNamste();

    public void concreteMethod() {
        System.out.println("This is a concrete method in an abstract class.");
    }
}

abstract class special2 extends special1 {
    public void helloWorld() {
        System.out.println("Hello, World!");
    }
    @Override
    void helloNamste() {
        System.out.println("Hello, Namaste!");
    }
}

class special3 extends special2 {
    @Override
    void display() {
        System.out.println("This is the implementation of the abstract method in special3.");
    }
}

public class special {
    public static void main(String[] args) {
        special1 obj = new special3();
        obj.display();
        obj.concreteMethod();
        obj.helloNamste(); 
        // obj.helloWorld(); // compile time error. 

        special2 obj2 = new special3();
        obj2.display();
        obj2.concreteMethod();
        obj2.helloWorld(); // compile time error. 
        obj2.helloNamste(); // compile time error. 
    }
}
