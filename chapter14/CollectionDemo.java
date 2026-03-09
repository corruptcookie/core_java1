import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

// Collection is an interface.
public class CollectionDemo {
    public static void main(String[] args) {
//        int[] values = new int[4];  // Fixed array

        // Can not specify index to add in Collection
//        Collection<Integer> values = new ArrayList<>();
        // List extends Collection with more features including add with index
        List<Integer> values = new ArrayList<>();
        values.add(3);
        values.add(5);
        values.add(8);
        values.add(1,9);    // 3 9 5 8
        Collections.sort(values);

//        Iterator<Integer> i = values.iterator();

//        while (i.hasNext()) {
//            System.out.println(i.next());
//        }

        for (int j : values) {  // Autounboxing
            System.out.println(j);
        }

    }
}
