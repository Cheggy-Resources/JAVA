package JAVA.01-basics.code-connect;

public class Arithmetic{
    public static void main(String[] args){
        double a = 10.345;
        float b = 8.5f; 

        float m = 4.55f;
        double n = 3.14;
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b)); 

        System.out.println("Increment: " + (m++)); 
        System.out.println("Increment: " + (++n));  
        System.out.println("Decrement: " + (--m));  
        System.out.println("Decrement: " + (n--)); 
        
        System.out.println("Modulus: " + (n % m)); // Not valid for boolean
        
    }
}

/*
RESULTS: 
-> int/int = int 
-> float/float = float
-> int/float = float
-> float/int = float 
-> double/double = double
-> int/double = double
-> double/int = double
-> float/double = double
-> double/float = double
(IMPLICIT TYPE CONVERSION) 

-> double = 5.5 
-> float = 5.5f (mandatory to add 'f') 
-> int = 5 

-> Increment(++) and Decrement(--) - works for int, char, float, double, byte, short etc. 
-> Not for Boolean and strings. 
-> ++3.5 may give 4.500000001. - as computer is trying to store in binary so its something 4.5000000003455...but gets rounded off while printingg.

-> Modulus (%) - works for int, float, double, char, byte, short etc.
-> Not for Boolean and strings. 
-> a % b = a - (b × floor(a / b))
*/
