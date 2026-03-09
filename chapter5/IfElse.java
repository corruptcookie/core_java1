class IfElse
{
    public static void main(String[] args)
    {
//        int num1 = 8;
//
//        if (num1 % 2 == 0)
//        {
//            System.out.println("Even");
//        } else
//        {
//            System.out.println("Odd");
//        }
        int a,b,c;
        a = 4;
        b = 3;
        c = 8;

        if(a > b && a > c)
        {
            System.out.println("A");
        }
        else if(b > c) // Do not need to check for a as we know a is not greatest
        {
            System.out.println("B");
        }
        else
        {
            System.out.println("C");
        }

    }
}