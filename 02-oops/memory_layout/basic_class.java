public class basic_class {
    int x = 10;               
    static basic_class obj = new basic_class();   

    basic_class() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {}
}

/*
BACKGROUND PROCESS: 
- After compilation of this file - .class file is generated. (stored in disk)
- JVM loads .class file into method area. 
- Class definitons gets stored there. AND memory is allocated to static vars. 
- obj = null (default value) 
- static vars - initialization starts. 
- new basic_class() -> obj is formed in heap memory. 
- All instance vars are given memory and initialized to default values. 
- x = 0 (default value) 
- x = 10 (explicit initialization) 
- Constructor is called. 
- obj is assigned the reference of the newly created object.
*/
