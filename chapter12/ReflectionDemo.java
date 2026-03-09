/*
    Accessing private method of public class using Reflection API.
    This should never be done normally.
    Only for debugging or frameworks like Spring.
 */
import java.lang.reflect.Method;

public class ReflectionDemo {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("Test");
        Test t = (Test) c.getDeclaredConstructor().newInstance();

        Method m = c.getDeclaredMethod("show", null);
        m.setAccessible(true);
        m.invoke(t, null);


    }
}

class Test {
    private void show() {
        System.out.println("This is private!");
    }
}
