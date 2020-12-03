package grokkingcodingitv.cyclicsort;

import java.util.ArrayList;
import java.util.List;

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
        } else {
          return nums[i];
        }
      } else {
        i++;
      }
    }
    return 0;
  }

  public List<Integer> findAllDuplicate(int[] nums) {
    List<Integer> result = new ArrayList<>();

    int i = 0;
    while (i < nums.length) {
      int pos = nums[i] - 1;
      if (nums[i] != nums[pos]) {
        int temp = nums[i];
        nums[i] = nums[pos];
        nums[pos] = temp;
      }
      else {
        i++;
      }
    }

    for (i = 0; i < nums.length; i++) {
      if (nums[i] != i + 1) {
        result.add(nums[i]);
      }
    }
    return result;
  }
}
