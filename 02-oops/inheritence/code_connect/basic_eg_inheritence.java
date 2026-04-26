class basic {
    int x; 
    public basic(){
        x = 5;
    }
}

public class tiny extends basic{
    public static void main(String[] args) {
        tiny t = new tiny();
        System.out.println("The value of x is: " + t.x);
    }
}

// MEMORY LAYOUT. 
/* 
- ClassLoader loads both the class files into method area from disk. 
- byte code verification (security check) 
- STATIC vars => memory allocate 
- RESOLUTION => bytecode mai <references> is treated like a normal names. 
       => here, symbolic references (names) -> direct references (memory address) 
       => eg: symbolic -> basic.x chahiye 
         => direct -> gives that address. (or offset/pointer)
- Static vars are initalised. 
- Main method is called.
- Object is created in heap.
    - Instance var memory allocated.
    - Parent constructor is called first.
    - Then child constructor is called. 
- ref var points to that object. 
*/
