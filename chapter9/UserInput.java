import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class UserInput {
    public static void main(String[] args) throws Exception{  // Needed to prevent error
        // Advanced Classes: Scanner & BufferedReader

        // Takes input as character and returns the ascii value
        // can only take a range between 0 and 255
        // can only take one character at a time
//        int i = System.in.read();
//        System.out.println((char)i); // casting to convert ascii

//        int i = 0;
//        String str = "";
//
//        while((i = System.in.read()) != 10) {
//            str += (char) i;
//        }
//
//        System.out.println(str);

        // BufferedReader Use:
        // System.in is input from keyboard
        // Stream reader turns it into stream format
//        InputStreamReader is = new InputStreamReader(System.in);
//        BufferedReader br = new BufferedReader(is);
//        // This also works
////        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int n = Integer.parseInt(br.readLine()); // COnvert String into int
//
//        System.out.println(n);

        // Scanner Use:
        String str = "";
        Scanner sc = new Scanner(System.in);

        str = sc.nextLine();
        System.out.println("Hello " + str);

        // Better to use the seocnd way
//        int i = Integer.parseInt(sc.nextLine());
        int i = sc.nextInt();
        System.out.println("i is " + i);
    }
}
