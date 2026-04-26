class multi_level_inherit1 {
    int x = 45; 
    public void display(){
        System.out.println("The value of x is: " + x);
    }
}

class multi_level_inherit2 extends multi_level_inherit1{
    int x = 50; 
    public void display(){
        System.out.println("The value of x is: " + x);
    }
} 

class multi_level_inherit3 extends multi_level_inherit2{
    int x = 55; 
    public void display(){
        System.out.println("The value of x is: " + x);
    }
}

public class multi_level_inherit {
    public static void main(String[] args) {
        multi_level_inherit1 t = new multi_level_inherit3();
        System.out.println(t.x); // 45
        t.display(); // The value of x is: 55
    }
}
