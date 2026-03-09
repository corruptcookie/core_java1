/*
 * Polymorphism is the idea of being able to reuse the same method names
 * for different purposes.
 *
 * The two ways we can do this in java is with Method Overloading and Method Overriding.
 *
 * Method Overloading - Change the number and/or types of parameters
 *
 * Method Overriding - Same method in child class
 */
class PolymorphismDemo {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.show();
        B obj2 = new B();

        /* Dynamic Method Dispatch
         * It does not matter what type your reference variable is, the method in the
         * instance variable is what will be called.
         * Reference a of class A points to Class B obj2. So a will print Hello in B.
         */
        A a = obj2;
        a.show();
    }
}

class A {   // Method Overloading, Early Binding, Static Binding, Compile Time Polymorphism
    public void show() {
        System.out.println("Hello in A");
    }

    public void show(int i) {
        System.out.println("Hello " + i);
    }

    public void show(double i) {
        System.out.println("Hello " + i);
    }
}

class B extends A {     // Method Overriding, Late Binding, Dynamic Binding,
    @Override           // Run Time Polymorphism
    public void show() {
        System.out.println("Hello in B");
    }
}