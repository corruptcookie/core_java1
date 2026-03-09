class LabeledBreak
{
    public static void main(String[] args)
    {
        // break switch loop
//        for(int i=1; i<=4; i++)
//        {
//
//            for(int j=1; j<=4; j++)
//            {
//                if(i == 3)
//                    break;  // Unlabeled break
//                System.out.print("* ");
//            }
//
//            System.out.println("");
//        }

        loop1: // Labels the outer loop
        for(int i=1; i<=4; i++)
        {

            for(int j=1; j<=4; j++)
            {
                if(i == 3)
                    break loop1;  // Labeled break
                System.out.print("* ");
            }

            System.out.println("");
        }

    }
}