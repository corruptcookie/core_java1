/*
* 153 -> 1 5 3
*        1*1*1 + 5*5*5 + 3*3*3 = 153
*/
class ArmstrongNum
{
    public static void main(String[] args)
    {
        int t = 153;
        int n = t, r, sum = 0;

        while(n>0)
        {
            r = n % 10;
            n = n / 10;
            sum += r*r*r;
//            System.out.println(r + " " + n + " " + sum);
        }

        if(sum == t)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }
}