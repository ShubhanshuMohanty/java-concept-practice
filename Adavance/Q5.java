public class Q5 {
    /*
     * Given one integer n. Your task is to find nth fibonacci number. You have to
     * return value of nth fibonacci number in BigInteger.
     * 
     * (Example: 1st Fibbonacci number is 1, 2nd is 1, 3rd is 2, 4th is 3 and so
     * on.)
     * 
     * Example 1:
     * 
     * Input:
     * n = 50
     * Output:
     * 12586269025
     * Explanation:
     * 50th Fibonacci number is 12586269025.
     */
    public static BigInteger fib(int n) {

        // write your code here
        // return nth fibonacci number in BigInteger
        BigInteger a = new BigInteger("0");
        BigInteger b = new BigInteger("1");
        BigInteger temp = new BigInteger("1");
        for (int i = 2; i <= n; i++) {
            temp = a.add(b);
            a = b;
            b = temp;
        }
        return b;
    }
}
