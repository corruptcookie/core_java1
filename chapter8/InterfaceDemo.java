/**
 * Interface allows you to do multiple inheritance in java and provides security.
 * We use interface to define the type of class.
 * Can define method if made default or static.
 * Cannot instantiate interfaces.
 * Three types of interfaces:
 * 1. Marker Interface -> without any methods
 *      - Can use marker interface to give permissions by checking instanceof
 * 2. SAM -> Single Abstract Method (only one method) -> Functional Interface
 * 3. Normal
 */
interface Abc {
    void show ();   // All methods in interface will be public abstract by default
}

interface yyy {

}

interface Pqr extends Abc, yyy{     // Interfaces support multiple inheritance
    void xyz();
}

class AbcImpl implements Abc {      // Must define all methods of interface
    public void show() {
        System.out.println("In show");
    }
}

class InterfaceDemo {
    public static void main(String[] args) {
        Abc obj = new AbcImpl();
        obj.show();

        Abc obj1 = new Abc(){       // Anonymous Class
            public void show(){
                System.out.println("In show");
            }
        };
        obj1.show();

        // Can also use lambda expression to define functional interface
        // Use brackets if multiline definition
        Abc obj2 = () -> System.out.println("In show");
        obj2.show();
    }
}