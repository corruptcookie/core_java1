class SwitchCase
{
    public static void main(String[] args)
    {
        // Instead of writing too many if statements use switch case
//        int i = 9;
//
//        switch(i)
//        {
//            case 0:
//                System.out.println("Zero");
//                break;      // Must put break in all cases or it will print all cases below the first true case
//
//            case 1:
//                System.out.println("One");
//                break;
//
//            case 7:
//                System.out.println("Seven");
//                break;
//
//            case 9:
//                System.out.println("Nine");
//                break;
//
//            default: // If no case matches
//                System.out.println("Some number");
//        }

        // Switch case supports strings
        String s = "Hello";

        switch(s)
        {
            case "Hi":
                System.out.println("Hi");
                break;

            case "Hello":
                System.out.println("Hello");
                break;
        }
    }
}