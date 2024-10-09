import java.util.ArrayList;

class Q1 {
    /*
     * You are given a ArrayList numbers that contains integers. You need to return
     * average of the non negative integers.
     */
    public static double posAverage(ArrayList<Integer> numbers) {
        double avg = 0;
        int sum = 0, cnt = 0;
        for (int n : numbers) {
            if (n >= 0) {
                sum += n;
                cnt++;
            }
        }
        avg = (double) sum / cnt;
        return avg;
    }
}