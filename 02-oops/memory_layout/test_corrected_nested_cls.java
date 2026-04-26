public class test_corrected_nested_cls {
    public static void main(String[] args){
        corrected_nested_cls.obj.onm.display(); 
    }
}

/*
HOW IT GOT CHANGED: 
- used this pointer which points to current object. 
- object was already created in heap memory but its reference was not stored in static variable obj.
- so when obj.new inner_cls() was called, it was null.new inner_cls() which caused NullPointerException.
- this pointer points towards current object so no issue.
*/

// ENTIRE FLOW
/*
- After compilation of this file - .class file is generated. (stored in disk)
- JVM loads .class file into method area.
- Class definitons gets stored there. AND memory is allocated to static vars.
- obj = null (default value)

- static vars - initialization starts.
- new nested_cls() -> obj is created in heap memory.
- All instance vars are given memory and initialized to default values.
- x = 0 (default value)
- onm = null (default value)

INSTANCE VARS INITIALIZATION STARTS - nothing to do. 
- Constructor is called.
- x = 40 (explicit initialization)
- onm = this.new inner_cls() -> current object reference.new inner_cls() 
    - new inner_cls() -> inner_cls object is created in heap memory.
    - no static vars 
    - instance vars are given memory and initialized to default values.
    - y = 0 (default value)
    - Constructor is called.
    - y = 345 (explicit initialization)
- onm is assigned the reference of the newly created object.
- obj is assigned the reference of the newly created object.
- main method is called.
- corrected_nested_cls.obj.onm.display() is called.
- This is display method of inner class is printed.
*/
