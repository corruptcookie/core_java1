import java.lang.reflect.InvocationTargetException;

// Use Class.forName() to load a class
// Will only run the static block of a class
// Will not create new instance unless you use .getDeclaredConstructor().newInstance()
// Will register driver as static block of driver usually tries to register

class Pqr {
    static {
        System.out.println("In Static");
    }

    // Instance
    {
        System.out.println("In instance");
    }
}

public class ForNameDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // Will only print in static
        Class.forName("Pqr");
        // Will print both
        Pqr obj = new Pqr();
        Class.forName("Pqr").getDeclaredConstructor().newInstance();
    }
}
