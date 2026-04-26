package JAVA.experiments.operators;

public class Assignment{
    public static void main(String[] args){
        double a = 10.345;
        float b = 8.5f; 
        int m = 4;
        byte n = 4;
        char ch = 'A';

        byte c = n;
        System.out.println(c); 

        a+=1; 
        System.out.println(a);
        b-=1;
        System.out.println(b);
        m*=2;
        System.out.println(m);
        n/=2;
        System.out.println(n);
        a%=3;
        System.out.println(a);
        ch+=1;
        System.out.println(ch);
    }
}

/*
-> Assignment Operators: =, +=, -=, *=, /=, %=, &=, |=, ^=, <<=, >>= 
-> = +=, -=, *=, /=, %= -> byte, short, int, long, float, double, char
-> &=, |=, ^= , <<=, >>= -> byte, short, int, long, char
-> Boolean can only use = 
-> String can only use = , += (concatenation)

-> byte b = 10; 
   b += 5; => b = (byte)(b + 5); 
   Auto typeconversion happens. 

-> byte b = 10; 
   b = b + 5; 
   b + 5 gives an int dtype. b is a byte dtype. so compile time error. 
   EXPLICIT TYPECASTING is required. 

-> all short, byte, char, int operations will give int dtype. 
   so we need to explicitly typecast. 

-> HOW NEGATIVE NUMBERS ARE STORED??? 
   1's complement - flip 0->1 and 1->0 
   2's complement - 1's complement + 1 
   
   STEPS:: 
   - ignore negative sign 
   - find binary equivalent 
   - takes 2 compliment int a = -5; 
   5 
   5 = 00000000 00000000 00000000 00000101 
   11111111 11111111 11111111 11111010 + 1 = 11111111 11111111 11111111 11111011

-> int 4 bytes -> -2^31 to 2^31-1 
-> char 2 bytes -> 0 to 65535 (unsigned)
-> byte 1 byte -> -128 to 127
-> short 2 bytes -> -32768 to 32767
-> long 8 bytes -> -2^63 to 2^63-1 

-> int = 4 bytes = 32 bits 
   -------- -------- -------- -------- 32 boxes of 1 bit each each box can have either 0 or 1 
   total combinations = 2^32 
   signed = -2^31 to 2^31 - 1 

*/
