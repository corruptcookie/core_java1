import java.util.ArrayList;

// How to measure the time

public class TimeDemo {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        long start, end;

        start = System.currentTimeMillis(); // millis from jan 1st 1970
        for (int i = 0; i < 100000000; i++) {
            a.add(i);
        }
        end = System.currentTimeMillis();

        System.out.println("Time: " + (end - start));

    }
}
