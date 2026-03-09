import java.util.HashMap;
import java.util.Map;

// Map -> Store key value pairs
// Keys cannot repeat, values can
// HashMap is not threadsafe, Hashtable is threadsafe
public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("myName", "Shasank");
        map.put("actor", "John");
        map.put("ceo", "Marisa");
        map.put("actor", "Chicken");    // Will replace the value


        System.out.println(map);
        System.out.println(map.get("myName"));  // Will give null if it does not exist

        for (String k : map.keySet()) {
            System.out.println(map.get(k));
        }
    }
}
