/*
    Inner Class Demo
        - A class within a class
        - Four Types:
        1. Member -> Separate inner class for each instance of outer class
        2. Static(Nested) -> Shared inner class for all instances of outer class
        3. Anonymous -> An inner class with no name
        4. Lambda -> Using lambda expression to create anonymous inner class
        - If B is inner class of A, it will be saved as A$B.class
 */
public class InnerDemo {
    public static void main(String[] args) {
        // 1. Member Inner Class
//        A obj = new A();
//        A.B obj1 = obj.new B();

        // 2. Static Inner Class
//        A.B obj = new A.B();
//        obj.show();

        // 3. Anonymous Inner Class
//        B obj = new B() {     // Saves as InnerDemo$1.class
//           @Override
//           public void show() {
//               System.out.println("Hi");
//           }
//        };
//        obj.show();

        // 4. Lambda
        B obj = () -> System.out.println("Hi"); // No .class file created
        obj.show();
    }
}

// 1. Member Inner Class
//class A {
//    int rollno;
//    String sname;
//
//    class B {
//        public void show() {
//            System.out.println("Hello");
//        }
//    }
//}

// 2. Static Inner Class
//class A {
//    int rollno;
//    String sname;
//
//    static class B {
//        public void show() {
//            System.out.println("Hello");
//        }
//    }
//}

// 3. Anonymous Inner Class
//class B {
//    public void show() {
//        System.out.println("Hello");
//    }
//}

// 4. Lambda
@FunctionalInterface
interface B {
    void show();
}