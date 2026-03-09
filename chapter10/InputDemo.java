import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Try with Resource
class InputDemo {
    public static void main(String[] args) {
        // Using try block with resource try(resource)
        // Resource will be unallocated after try block
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str = "";
            str = br.readLine();

        } catch (Exception e) {
            System.out.println(e);

        }

    }
}
