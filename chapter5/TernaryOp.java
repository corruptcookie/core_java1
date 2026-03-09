class TernaryOp
{
    public static void main(String[] args)
    {
//        int i = 1;
//        int j = 5;
//
//        if(i==1)
//            j=6;
//        else
//            j=7;
//        j = i==1?6:7;  //Does same as if else above
//        System.out.println(j);

        Object obj1;
        Object obj2;

        if(true)
        {
            obj1 = Integer.valueOf(10);
        }
        else
        {
            obj1 = Double.valueOf(15.0);
        }

        // Ternary Operator checks the value of both values and choose the maximum.
        // Which is why the output is 10.0
        obj2 = true?Integer.valueOf(10):Double.valueOf(15.0);
        System.out.println(obj1);
        System.out.println(obj2);
    }
}