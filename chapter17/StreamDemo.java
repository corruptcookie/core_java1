import java.util.Arrays;
import java.util.List;

/*
 * Filter takes a Predicate (boolean function) and only keeps values that pass as true
 * findFirst will find the first value
 * Will return optional type which will return optional.empty if there is no element
 * Can use orElse(0) if filter or find first returns empty
 *
 * .filter and .map use lazy evaluation
 * - Delays calculation of an expression until its values is actually required
 * - A terminal function is what starts the calculation
 */

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(12,20,35,46,55,68,75);

        // Logic
//        int result = 0;
//        for (int i : values) {
//            if (i % 5 == 0) {
//                result += i;
//            }
//        }

        System.out.println(values.stream()
                .filter(i -> i % 5 == 0)
                .reduce(Integer::sum)
                .orElse(0));    // So we can print Integer instead of optional

        // Find first value divisible by 5
        System.out.println(values.stream()
                .filter(i -> i % 5 == 0)
                .findFirst()
                .orElse(0));
        /*  ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
            Lazy evaluation is used here. When findFirst asks for the first value,
            filter will only find the first element divisible by 5 and then stop.
         */
    }
}
