interface multiple_inherit1 {
    int x = 5;
    default void display(){
        System.out.println("This is display method from multiple_inherit1 interface.");
    }
}

interface multiple_inherit2 {
    int x = 10;
    default void display(){
        System.out.println("This is display method from multiple_inherit2 interface.");
    }   
}

public class multiple_inherit implements multiple_inherit1, multiple_inherit2 {
    public void display(){
        System.out.println("This is display method from multiple_inherit1 interface.");
    }

    public void parentDisplay(){
        multiple_inherit1.super.display();
        multiple_inherit2.super.display();
    }

    public static void main(String[] args) {
        multiple_inherit t = new multiple_inherit();
        t.display();

        multiple_inherit1 obj1 = new multiple_inherit();
        multiple_inherit2 obj2 = new multiple_inherit();

        System.out.println("The value of x is: " + multiple_inherit1.x);
        System.out.println("The value of x is: " + multiple_inherit2.x);

        obj1.display(); 
        obj2.display(); 

        t.parentDisplay();
    } 
}

/*
- t obj => can only invoke display() not x. 
    -> why? x is ambiguous. it is present in bot the interfaces. 
    -> display() would have been overridden in the class. so, no ambiguity. 
- obj1 => calls x -> due to complie time binding. gives 5. 
    -> display() -> calls display of class inheriting => due to runtime binding. 
- obj2 => calls x -> due to complie time binding. gives 10.
    -> display() -> calls display of class inheriting => due to runtime binding.
- parentDisplay() -> calls display of both the interfaces.  
    -> internally we have used super keyword to get the display method of both the interfaces and not the overridden one. 
    -> interface.super.display() 
    -> super() can be called from the implementing class. 
       -> but from a non-static method. not static. 
           -> why? super means call my parent field/method. 
           -> static method is not related to any obejct. related to class. 
*/

