class Fibonacci
{
    public static void main(String[] args)
    {
        int k,a,b;
        k = 1;
        a = 0;
        b = 0;

        while(k<=50)
        {
            System.out.println(k);
            b = a;
            a = k;
            k = a + b;
        }
    }
}