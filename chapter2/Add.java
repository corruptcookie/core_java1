class Add
{
    public static void main(String[] args)
    {
//        // Hardcoding Example
//        System.out.println(3+6);
//
//        //Using Variables
//        int num1=6;
//        int num2=3;
//        System.out.println(num1+num2);
//
//        //Changing Variables
//        int num3=6;
//        int num4=3;
//        num4=5;
//        System.out.println(num3+num4);
        //Using Float Variables

        //Will give incompatible type error as all decimals are doubles
        //float num1=6.4;
        //float num2=3.3;

        //double num1=6.4;      //Will Work
        //double num2=3.3;

        //float num1=6.4f;      //Will Work (must specify with f)
        //float num2=3.3f;
        //System.out.println(num1+num2);

        //Using char
        char c = 'A';   //Should be in single quotes
        System.out.println(c);
        System.out.println((int)c); //Type casting (Convert character into int) (ASCII value)
    }
}