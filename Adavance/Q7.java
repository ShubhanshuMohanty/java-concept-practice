public class Q7 {
    /*
     * Next Prime Number-BigInteger
     */
    public static int nextPrime(int n) {

        // write your code here
        // Use BigInteger to solve
        BigInteger x = BigInteger.valueOf(n);
        String s = x.nextProbablePrime().toString();
        return Integer.parseInt(s);

    }
}
