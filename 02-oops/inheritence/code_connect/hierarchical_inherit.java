class hierarchical_inherit1 {
    int x = 45; 
    public void display(){
        System.out.println("The value of x is: " + x);
    }
}

class hierarchical_inherit2 extends hierarchical_inherit1{
    int x = 50; 
    public void display(){
        System.out.println("The value of x is: " + x);
    }
} 

class hierarchical_inherit3 extends hierarchical_inherit1{
    int x = 55; 
    public void display(){
        System.out.println("The value of x is: " + x);
    }
}

public class hierarchical_inherit {
    public static void main(String[] args) {
        hierarchical_inherit1 t1 = new hierarchical_inherit2();
        System.out.println(t1.x); // 45
        t1.display(); // The value of x is: 50

        hierarchical_inherit1 t2 = new hierarchical_inherit3();
        System.out.println(t2.x); // 45
        t2.display(); // The value of x is: 55
    }
}
