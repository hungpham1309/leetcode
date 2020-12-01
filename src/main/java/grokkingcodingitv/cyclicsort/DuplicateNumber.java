package grokkingcodingitv.cyclicsort;

public class DuplicateNumber {

  /**
   * Input: [1, 4, 4, 3, 2] Output: 4 dont use extra space
   */
  public int findDuplicateNumber(int[] nums) {
    int i = 0;
    while (i < nums.length) {
      int shouldBePost = nums[i] - 1;
      if (nums[i] != i + 1) {
        if (nums[i] != nums[shouldBePost]) {
          //swap
          int temp = nums[shouldBePost];
          nums[shouldBePost] = nums[i];
          nums[i] = temp;
        }
        else return nums[i];
      } else {
        i++;
      }
    }
    return 0;
  }
}
