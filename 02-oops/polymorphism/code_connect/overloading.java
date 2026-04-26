class maths{
    public int add(int a, int b){
        return a + b;
    }

    public double add(double a, double b){
        return a + b;
    }

    public int add(int a, int b, int c){
        return a + b + c;
    }
}

public class overloading {
    public static void main(String[] args) {
        maths m = new maths();
        System.out.println(m.add(5, 10)); // Calls the method with 2 int parameters
        System.out.println(m.add(5.5, 10.5)); // Calls the method with 2 double parameters
        System.out.println(m.add(5, 10, 15)); // Calls the method with 3 int parameters
    }
}
