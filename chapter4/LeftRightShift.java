class LeftRightShift
{
    public static void main(String[] args)
    {
        int a = 8; // 1 0 0 0
        int b = a << 2; // 1 0 0 0 0 0 (Left Shift)
        int c = a >> 2; // 1 0 (Right Shift)
        int d = 25; // 1 1 0 0 1
        int e = d >> 2; // 1 1 0 -> 6 (Right shift will drop values)
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(e);
    }
}