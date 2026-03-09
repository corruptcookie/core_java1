class BitwiseAndOr
{
    public static void main(String[] args)
    {
        int a = 25; // 1 1 0 0 1
        int b = 15; // 0 1 1 1 1

        int c = a & b; // 0 1 0 0 1 -> 9
        int d = a | b; // 1 1 1 1 1 -> 31
        System.out.println(c);
        System.out.println(d);
    }
}