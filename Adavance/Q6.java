public class Q6 {
    /*
     * Check Prime-BigInteger
     */
    public static boolean prime(int n){
    
        //write your code here
        //Use BigInteger to solve the problem
        if(n<=0)
        {
            return false;
        }
        BigInteger b = BigInteger.valueOf(n);
        return b.isProbablePrime(n);
        
    }
}
