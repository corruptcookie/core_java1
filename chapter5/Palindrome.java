class Palindrome
{
    public static void main(String[] args)
    {
        int og = 121;
        int n=og,r,s=0;
        while(n>0)
        {
            r=n % 10;
            n=n / 10;
            s=s * 10 + r;
        }
        System.out.println(s);
        System.out.println(s == og);
    }
}