package grokkingcodingitv.cyclicsort;

import java.util.ArrayList;
import java.util.List;

public class MissingNumber {

    /**
     * Input: [8, 3, 5, 2, 4, 6, 0, 1]
     * Output: 7
     */
    public int findMissingNumber(int[] nums){

        //cylic sort; O(n)
        int i = 0;
        while (i < nums.length) {
            if (nums[i] < nums.length && nums[i] != i) {
                //swap
                int temp = nums[nums[i]];
                nums[nums[i]] = nums[i];
                nums[i] = temp;
            }
            else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j) {
                return j;
            }
        }
        return nums.length;
    }

    /**
     * Input: [2, 3, 1, 8, 2, 3, 5, 1]
     * Output: 4, 6, 7
     */
    public List<Integer> findAllMissingNumbers(int[] nums){

        List<Integer> result = new ArrayList<>();
        //cylic sort; O(n)
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != nums[nums[i] - 1]) {
                //swap
                int temp = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = temp;
            }
            else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j]!= j+1) {
                result.add(j+1);
            }
        }
        return result;
    }
}
