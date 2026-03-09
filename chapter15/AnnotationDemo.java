/*
    Annotations helps compiler to catch errors like with misspelled name in override.
    Also helps other programmers understand what the intention of the code is.
    @FunctionalInterface <- State the type of interface
    @Override <- State we are overriding a method
    @SuppressWarnings <- Suppress any warning such as unchecked
    @Deprecated <- Help programmers avoid old code

    Marker Annotation <- Annotations with no values inside.
    Single Value Annotation <- Only one value.
    Multi Value Annotation <- Multiple values.

    Meta Annotation
        - Specify what the annotation should be used for
        - How long the annotation should be available
 */

import java.lang.annotation.*;

// Override Annotation Example
class C {
    public void show() {
        System.out.println("In C");
    }
}

class D extends C {
    @Override   // This is an annotation.
    public void show() {    // Method will give compile error, if it isn't an override.
        System.out.println("In D");
    }
}

// Custom Annotation Example

// Specifies on what level we are using the annotation
// Meta Annotation
// ElementType.TYPE is class or interface level
@Target(ElementType.TYPE)
// Specifies up until what time the annotation will be available
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone {    // Use @interface to define annotation
    // Values must have round brackets, since they are treated as abstract methods
    String os() default "Symbian";  // Can set default values
    int version() default 1;
}

@SmartPhone(os = "Android", version = 6)
class NokiaASeries {
    String model;
    int size;

    public NokiaASeries(String model, int size) {
        this.model = model;
        this.size = size;
    }
}

public class AnnotationDemo {
    public static void main(String[] args) {
        D obj = new D();
        obj.show();

        NokiaASeries obj1 = new NokiaASeries("Fire", 5);
        Class c = obj1.getClass();
        Annotation an = c.getAnnotation(SmartPhone.class);
        SmartPhone s = (SmartPhone) an;
        System.out.println(s.os());
    }
}
