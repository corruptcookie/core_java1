class StaticDemo {
    public static void main(String[] args) {
        Abcd.show();        // Do not need to create object if method is static
        Abcd.i = 6;
    }
}

class Abcd {
    static int i;
    // Cannot use non-static variables inside static method
    public static void show() {
        System.out.println("Hi");
    }
}