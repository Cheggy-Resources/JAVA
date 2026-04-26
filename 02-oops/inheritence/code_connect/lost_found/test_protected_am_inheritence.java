public class test_protected_am_inheritence extends protected_am_inheritence{
    public static void main(String[] args) {
        test_protected_am_inheritence t = new test_protected_am_inheritence();
        t.display();
    }
}


/*
test_protected_am_inheritence t = new test_protected_am_inheritence();
        t.display();
    => Worked perfectly for protected method. 

    BUT 
protected_am_inheritence t = new test_protected_am_inheritence();
    t.display();
    => Didn't work...

    So, protected method can be accessed in subclasses but only via subclass type reference var. 
    REASON - Java says inheritence must be implemented to call protected members. 
    In compile time itself, compiler checks for this and gives error.
*/
