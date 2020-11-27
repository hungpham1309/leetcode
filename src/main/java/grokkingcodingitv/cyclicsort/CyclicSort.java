package grokkingcodingitv.cyclicsort;

public class CyclicSort {

  /**
   * sort 1-> n Input: [1, 5, 6, 4, 3, 2] Output: [1, 2, 3, 4, 5, 6]
   */

  public void cyclicSort(int[] nums) {
    int i = 0;

    while (i < nums.length) {
      if (i != nums[i] - 1) {
        //swap
        int temp = nums[nums[i] - 1];
        nums[nums[i] - 1] = nums[i];
        nums[i] = temp;
      } else {
        i++;
      }
    }
  }
}
