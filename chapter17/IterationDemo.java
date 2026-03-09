import java.util.Arrays;
import java.util.List;

/*
 *  Stream API
 *  Functional Programming
 *      - Do not focus on how to do things, just focus on what to do.
 *      - The remaining will be handled by your Stream API.
 */
public class IterationDemo {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,2,3,4,5,6);

        // External iterations
        // All loops will fetch data from the array

//        for (int i = 0; i < 6; i++) {
//            System.out.println(values.get(i));
//        }

//        Iterator<Integer> i = values.iterator();
//
//        while (i.hasNext()) {
//            System.out.println(i.next());
//        }

//        for (int i : values) {
//            System.out.println(i);
//        }

        // Internal Iterations
        // Method within collection for iteration
        // Stream API

        // Expects a Consumer (functional interface with one argument and returns nothing)

        // Lambda Expression
        // We take the value and do something with it
//        values.forEach(i -> System.out.println(i));
//        values.forEach(i -> doubleIt(i));

        // Method Reference
        // forEach takes the value, and we tell it what to do
        // Use :: to point to the method we want to use
        values.forEach(System.out::println);
        values.forEach(IterationDemo::doubleIt);

        // Can also use stream to do this
        // Advantage is we get more functionality like threads
//        values.stream().forEach(System.out::println);
//        values.parallelStream().forEach(System.out::println);


    }

    public static void doubleIt(int i) {
        System.out.println(i*2);
    }
}
