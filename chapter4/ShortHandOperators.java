class ShorthandOperators
{
    public static void main(String[] args)
    {
        // Usage with ints
        int i=5;

        i += 2; //i = i + 2;
        i -= 2; //i = i - 2;
        i *= 2; //i = i * 2;
        System.out.println(i);

        // Usage with bytes
        byte b=8;
        //b = b * 2.5; // Error: Incompatible types (Turns into Double 20.0 instead of Byte)
        b *= 2.5; // Will not Error (Casts the double into byte)
        System.out.println(b);
    }
}