import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class DemoException {
    // throws suppresses the error or exception
    // Only use if you're damn lazy. Always use try catch.
    public static void main(String[] args) throws IOException {
        int i, j, k = 0;
        int[] a = new int[4];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        i = 8;


        // Unchecked exception (If j is zero, an exception will be thrown)
        // Compiler will not force you to handle as it does not know value of j
        try {
            System.out.println("Enter a number:");
            j = Integer.parseInt(br.readLine());    // Checked Exception
            if (j < 2) {
                throw new ArithmeticException();    // Can throw exception manually
            }
            k = i / j;
            System.out.println("Output is " + k);

            for (int l = 0; l <= 4; l++) {  // Also unchecked
                a[l] = l + 1;
            }

        } catch (ArithmeticException e) {
            System.out.println("j cannot be less than 2");
//            System.out.println("Cannot Divide By Zero");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Maximum number of values is 4");

        } catch (IOException e) {
            System.out.println("Yo input a int");

        } catch (Exception e) {
            System.out.println("Unknown Exception" + e);

        } finally {     // Will always be called after try is complete
            br.close();
            System.out.println("BYE");
        }

    }
}
