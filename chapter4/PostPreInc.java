class PostPreInc
{
    public static void main(String[] args)
    {
        int i = 5;
        System.out.println(i);
        int j = i++; // i = i + 1; (Post Increment) j will get value of i then i will increase
        System.out.println(j + " : " + i);
        int k = ++i; // i = i + 1; (Pre Increment) i will increase then k will get value of i
        // i = i++; Will stay as 5 since i will be incremented and then assigned 5 again
        System.out.println(k + " : " + i);
    }
}