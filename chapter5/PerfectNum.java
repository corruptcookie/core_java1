class PerfectNum
{
    public static void main(String[] args)
    {
        // 6 -> 1 + 2 + 3 = 6
        // 28 -> 1 + 2 + 4 + 7 + 14 = 28

        int n = 28;
        boolean b = isPerfect(n);

        if(b)
            System.out.println("Perfect");
        else
            System.out.println("Not Perfect");
    }

    public static boolean isPerfect(int n)
    {
        int sum = 0;

        for(int i=1; i<=n/2; i++)
        {
            if(n % i == 0)
                sum += i;
        }

        if(sum == n)
            return true;
        return false;
    }
}