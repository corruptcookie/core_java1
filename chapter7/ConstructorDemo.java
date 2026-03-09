/**
 * A constructor is
 * 1) Member Method
 * 2) Same name as class name
 * 3) Will never return Anything
 * 4) Will be used to allocate memory
 * 5) When object is instantiated the constructor method is run
 *
 * Every class has a default constructor.
 * Constructor Overloading - Multiple constructors in the same class.
 *
 */
class ConstructorDemo {
    public static void main(String[] args) {
        Abc obj = new Abc(); // Calling constructor
        Abc obj1 = new Abc(10); // Calling constructor
    }
}

class Abc {
    int k = 0;
    public Abc() {      // Default Constructor (Not Necessary to write)
        System.out.println("Default was called.");
        k = 5;
    }

    public Abc(int i) {     // Constructor Overloading
        System.out.println("i = " + i);
    }

    // Will be implicitly called if there is no int parameter constructor
    // DOES NOT WORK the other way around since int cannot store a double
    public Abc(double j) {
        System.out.println("j = " + j);
    }
}