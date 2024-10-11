public class Q3 {
    /*
     * Given two BigIntegers X and Y. You have to find the remainder when X divides
     * Y.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input:
     * X = 3, Y = 4
     * Output:
     * 1
     * Explanation:
     * 1 is the remainder when X divides Y.
     */
    class MathematicalOperation {

        static BigInteger mod(BigInteger x, BigInteger y) {
            // Your code here
            return y.mod(x);
        }

    }
}
