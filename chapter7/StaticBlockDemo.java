public class StaticBlockDemo {
    /**
     * Static Block
     * Executed when your class is loaded into jvm.
     * Will happen before main method.
     * Purpose:
     * Help instantiate static variables
     */
    static {
        System.out.println("Hello World in static 1");
    }
    public static void main(String[] args) {
        // Want to print hello world without using sout in main
        System.out.println("In Main");
    }
    static {    // static block can also be after main
        System.out.println("Hello World in static 2");
    }
}
