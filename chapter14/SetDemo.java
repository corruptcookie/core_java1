import java.util.HashSet;
import java.util.Set;

// Set Interface
// Supports only unique elements

public class SetDemo {
    public static void main(String[] args) {
        // Values in hashtable is set using an algorithm
        // So values will not be stored in proper sequence
        // So when printing it is not guarenteed to print in order
        // TreeSet will give value in order
        Set<Integer> values = new HashSet<>();

        // Will return boolean value true
        values.add(5);
        values.add(6);
        values.add(9);
        // Will return boolean value false
//        values.add(6);

        for (int i : values) {
            System.out.println(i);
        }
    }
}
