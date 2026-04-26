public class test_nested_cls {
        public static void main(String[] args){
            nested_cls.obj.onm.display(); 
    } 
}

// Caused by: java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "JAVA.experiments.oops.memory_layout.nested_cls.obj" is null

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

INSTANCE VARS INITIALIZATION STARTS
- onm = obj.new inner_cls() -> null.new inner_cls() -> NullPointerException 
*/
