class vehicle{
    public void display(){
        System.out.println("This is a vehicle.");
    }
}

class car extends vehicle{
    public void display(){
        System.out.println("This is a car.");
    }

    public void carMethod(){
        System.out.println("This is a method specific to car.");
    }
}
public class overriding {
    public static void main(String[] args) {
        vehicle v = new vehicle();
        vehicle c = new car();
        v.display(); // Calls vehicle's display method
        c.display(); // Calls car's display method
        // c.carMethod(); // This would cause a compile-time error because the reference type is vehicle
    }
}
