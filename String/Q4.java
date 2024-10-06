public class Q4 {
    public static void printBinary(int n)
    {
        String s="";
        while(n>0)
        {
            s=n%2+s;
            n=n/2;
        }
        System.out.println(s);
    }
}
