import java.util.ArrayList;

/**
 * Wrapper Class
 * int, float, double, char
 * Integer, Float, Double, Character <- Wrapper Classes
 *
 * When working with frameworks we want to use Integer for better features and
 * functionality.
 * But with for loops we want to use int (primitive types) since it is faster.
 */
class Wrap {
    public static void main(String[] args) {
        int i = 5;
        Integer ii = new Integer(i); // Boxing
        Integer jj = i;     // AutoBoxing

        int j = jj.intValue();      // Unboxing
        int k = jj;                 // AutoUnboxing

        // Generics only works with classes not primitive types
        ArrayList<Integer> values = new ArrayList<Integer>();
        values.add(5);      // Autoboxing to Integer
        values.add(7);
        // values.add("Shasank");   // Won't work since we used generics


    }
}
