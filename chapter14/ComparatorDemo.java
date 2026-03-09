import java.util.ArrayList;
import java.util.List;

// Use comparator to change the logic of the sorting technique
// In this example, we want to sort by the last digit of each value.

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(305);
        values.add(998);
        values.add(774);
        values.add(236);
        values.add(881);

//        Comparator<Integer> com = (o1, o2) -> Integer.compare(o1 % 10, o2 % 10);

        values.sort((o1, o2) -> Integer.compare(o1 % 10, o2 % 10));

        for (int i : values) {
            System.out.println(i);
        }
    }
}

//class ComImpl implements Comparator<Integer> {
//    @Override
//    public int compare(Integer o1, Integer o2) {
//
//        return Integer.compare(o1 % 10, o2 % 10);
//    }
//}
