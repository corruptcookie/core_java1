import java.util.ArrayList;
import java.util.List;

// Can do <T extends Number> to make sure T is subclass of Number
class Container<T> {    // Only supports classes
    T value;

    public void show() {
        System.out.println(value.getClass().getName());
    }

    // Can do <? super T> so parameter supports all superclasses of T
//    public void demo(ArrayList<? extends Number> obj) {
//
//    }
}

// Generics -> Allows for type safety with Collections
public class GenericsDemo {
    public static void main(String[] args) {
        int value = 5;

        List<Integer> values = new ArrayList<>();
        values.add(value);
        values.add(8);

        // Value will become Integer type
        Container<Integer> obj = new Container<>();
        obj.value = 9;
        obj.show();

    }
}
