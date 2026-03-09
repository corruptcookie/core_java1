class SwapNums
{
    public static void main(String[] args)
    {
        // How to swap numbers without using temp variable
        int a = 5; // 101
        int b = 4; // 100

        a = a + b; // 1001 (This way wastes one bit)
        b = a - b;
        a = a - b;

        // Using Bitwise XOR
        a = a ^ b; // 001
        b = a ^ b; // 101
        a = a ^ b; // 100

        // Easiest Way
        b = a + b - (a = b); // Looks horrible never doing it


        System.out.println(a);
        System.out.println(b);
    }
}