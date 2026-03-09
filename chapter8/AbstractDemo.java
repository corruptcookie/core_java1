/**
 * Abstraction
 * Abstract class cannot be instantiated. Acts as a blueprint.
 * Abstract classes do not need to have abstract methods, but if there are abstract
 * methods the class must be abstract.
 * Abstract methods can be declared, not defined.
 * A class that inherits an abstract class must define all abstract methods, or become
 * abstract as well.
 */
class AbstractDemo {
    public static void main(String[] args) {
        // MaheshPhone obj = new MaheshPhone(); // Cannot instantiate abstract class
        // obj.call();
        MaheshPhone obj = new SureshPhone();
        obj.call();
        obj.cook();
        obj.dance();
        obj.move();
    }
}

// Mahesh wants to create new phone
abstract class MaheshPhone {
    public void call() {
        System.out.println("Calling...");
    }

    public abstract void move();    // Mahesh doesn't know how to do this yet
    public abstract void dance();
    public abstract void cook();
}

// Ramesh want to build the same phone
abstract class RameshPhone extends MaheshPhone {
    public void move() {
        System.out.println("Moving...");
    }

    // Ramesh failed to define dance and cook so his phone also must be abstract
}

// Suresh wants to build the same phone
class SureshPhone extends RameshPhone {     // Concrete class
    public void dance() {
        System.out.println("Dancing...");
    }

    public void cook() {
        System.out.println("Cooking...");
    }
}