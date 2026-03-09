import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

// Print only duplicate elements in an ArrayList

public class DupDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Chicken");
        names.add("Cow");
        names.add("Goat");
        names.add("Goat");

        Set<String> s = new HashSet<>();

        for (String n : names) {
            if (s.add(n)==false)
                System.out.println(n);
        }
    }
}
