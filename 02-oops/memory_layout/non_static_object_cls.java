public class non_static_obj_cls {
    int x = 10;

    non_static_obj_cls() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        non_static_obj_cls obj = new non_static_obj_cls();   
        System.out.println(obj.x);
    }
}

/*
- After compilation of this file - .class file is generated. (stored in disk)
- JVM loads .class file into method area.
- Class definitons gets stored there. AND memory is allocated to static vars. 
- No static vars in this class.
- main() is called.
- in stack memory - reference variable obj is created. and is in uninitialized state.
    => REF VAR remains at unitialised state for NON-STATIC VARS. 
    => REF VAR is assigned null (default value) for STATIC VARS.
- new non_static_obj_cls() -> obj is created in heap memory .
- All instance vars are given memory and initialized to default values.
- x = 0 (default value)
- x = 10 (explicit initialization)
- Constructor is called.
- obj is assigned the reference of the newly created object.
- System.out.println(obj.x) -> 10 is printed.
*/
