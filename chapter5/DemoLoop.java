class DemoLoop
{
    public static void main(String[] args)
    {
//        int i = 1;

        //Checks condition then executes while loop (While Loop)

//        while(i<=10)
//        {
//            System.out.println(i);
//            i++;
//        }

        //Executes while loop then checks condition (Do While Loop)

//        do
//        {
//            System.out.println(i);
//            i++;
//        } while(i<10);

//        for(int i=1; i<10; i++)
//        {
//            System.out.println(i);
//        }

        /************ PATTERNS PRACTICE (5.10 - 5.14) ************/
//        for(int i=1; i<=4; i++)
//        {
//            for(int j=0; j<=3; j++)
//            {
//                int temp = (i + j) % 4;
//                System.out.print(temp==0?4:temp);
//            }
//            System.out.println();
//        }

//        for(int i=1; i<=5; i++)
//        {
//            for(int j=1; j<=i; j++)
//            {
//                System.out.print((i + j - 1) % 2);
//            }
//            System.out.println();
//        }

        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}