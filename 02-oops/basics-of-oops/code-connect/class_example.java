// Basic example of a class with constructor, fields and methods.

public class Student {
    String name; 
    int rollNo;
    int age; 

    Student(String name, int rollNo, int age){
        this.name = name; 
        this.rollNo = rollNo;
        this.age = age;
    }

    public void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Alice", 1, 20);
        Student s2 = new Student("Bob", 2, 22);
        s1.displayDetails();
        s2.displayDetails();
    }    
}


