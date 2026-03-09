import java.util.Arrays;
import java.util.List;

/*
 * How to use Map and Reduce
 * Apply modifications without mutation
 * Map requires a Function and applies this function on all objects within the array
 * Reduce requires a BinaryOperator and carries the value until all objects are processed
 */
public class MapReduceDemo {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,2,3,4,5,6);

        // How to compute this with map and reduce

//        int result = 0;
//
//        for (int i : values) {
//            result += i*2;
//        }

        // Same with method reference
//        System.out.println(values.stream().map(i -> i*2).reduce(0,(c,e) -> c+e));
        System.out.println(values.stream().map(i -> i*2).reduce(0,Integer::sum));
    }
}
