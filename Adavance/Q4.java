public class Q4 {
    /*
     * Given one integer x. Your task is to find factorial of x. You have to return
     * value of factorial x in BigInteger.
     * 
     * 
     * 
     * Example:
     * 
     * 
     * Input:
     * x = 10
     * 
     * Output:
     * 3628800
     * 
     * Explanation: Factorial of x is 3628800.
     */
    public static BigInteger factorial(int x){
        
        //write your code here
        //return factorial of x as datatype of BigInteger
        BigInteger sm=new BigInteger("1");
        for(int i=1;i<=x;i++)
        {
            BigInteger y=BigInteger.valueOf(i);
            sm=sm.multiply(y);
        }
        return sm;    
    }
}
