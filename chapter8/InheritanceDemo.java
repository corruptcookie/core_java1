/**
 * Main purpose of inheritance is reusability.
 *
 * Inheritance - A class can inherit the methods of another class by
 * becoming an extension of it.
 * Types:
 * Single Level: B -> A  (B extends A) (B is (child,super), A is (parent,sub))
 * Multi-level: C -> B -> A  (C extends B which extends A)
 * Multiple: C -> A  &  B -> A  (C extends A and B) (This is not supported in Java)
 *
 * Object Creation in Inheritance:
 * If class B extends class A, then the constructor in class B will call super() on
 * default constructor of class A automatically.
 *
 * If we want to call a specific constructor in the super class, we can use super();.
 *
 * We can also create super class variable of subclass object. A obj = new B();.
 * This is called Upcasting.
 */

public class InheritanceDemo {
    public static void main(String[] args) {
        Mul obj = new Mul();
        obj.num1=5;
        obj.num2=4;
        obj.sum();
        System.out.println(obj.result);
        obj.sub();
        System.out.println(obj.result);
        obj.mul();
        System.out.println(obj.result);
    }
}

class Add {
    int num1, num2, result=0;

    public void sum() {
        result = num1 + num2;
    }
}

/* If Add class was created by someone else and not accessible by us.
 * We can extend the class to have more functionality with inheritance.
 */
class Sub extends Add {     // Single Level Inheritance
    public void sub() {
        result = num1 - num2;
    }
}

class Mul extends Sub {     // Multi-level Inheritance
    public void mul() {
        result = num1 * num2;
    }
}