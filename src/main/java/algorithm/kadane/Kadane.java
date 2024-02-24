package algorithm.kadane;

public class Kadane {

    /**
     * S = [4,-1,2,-7,3,4]
     * Find the non-empty subarray with the largest sum
     * output = 7, explain: 3+4 = 7
     */

    /**
     * Idea of kadane is to keep track of current sum of the position we consider, and if the current sum is below 0, reset it to 0
     * for example of the above S, we will have currentSum = [4,3,5,0 (reset) , 3,7]
     */


    public int kadane(int[] S) {
        int maxSum = S[0];
        int curSum = 0;

        for (int target : S) {
            curSum = Math.max(curSum, 0);
            curSum += target;
            maxSum = Math.max(maxSum, curSum);
        }
        return maxSum;
    }


    /**
     * Through this idea of kadane, we can apply it to Sliding Window
     * Return the index of the subarray of the largest sum
     */
    public int[] indexOfLargestSum(int[] S) {
        int maxSum = S[0];
        int curSum = 0;
        int L = 0, maxL = 0, maxR = 0;
        for (int R = 0; R < S.length; R++) {
            if (curSum < 0) {
                curSum = 0;
                L = R;
            }
            curSum += S[R];
            if (curSum > maxSum) {
                maxSum = curSum;
                maxL = L;
                maxR = R;
            }
        }
        return new int[]{maxL, maxR};
    }
}
