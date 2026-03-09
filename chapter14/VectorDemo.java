import java.util.Vector;

// Vector (part of java from the beginning)
// ArrayList added with Collections to work with List interface
// Similar functionality between the two
// ArrayList will increase capacity by 50% instead of 100%
// Vector is ThreadSafe, ArrayList is not ThreadSafe
// ArrayList is fast, vector is slow
// !!!!!!! Always prefer ArrayList !!!!!!
public class VectorDemo {
    public static void main(String[] args) {
        // Dynamic Array
        Vector<Integer> v = new Vector<>();
        v.add(4);
        v.add(6);
        v.add(4);
        v.add(6);
        v.add(4);
        v.add(6);
        v.add(4);
        v.add(6);
        v.add(4);
        v.add(6);
        v.add(4);
        v.add(6);
        v.add(4);
        v.add(6);

        // By default the capacity is 10
        // Vector will double the capacity when reaching the limit
        // So 10 -> 20 -> 40
        System.out.println(v.capacity());

        for (int i : v) {
            System.out.println(i);
        }
    }
}
