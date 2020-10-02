package grokkingcodingitv;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllTwoSum {

  /**
   * find all doublets of an array that add up to a given number not duplicate
   * <p>
   * Input: nums = [2,7,11,6], target = 13 Output: [0,2] , [1,3]
   */

  public List<Integer[]> twoSum(int[] nums, int target) {
    Map<Integer, Integer> hm = new HashMap<>();

    List<Integer[]> result = new ArrayList<>();
    for (var i = 0; i < nums.length; i++) {
      var valueNeeded = target - nums[i];
      if (hm.containsKey(valueNeeded)) {
        result.add(new Integer[]{hm.get(valueNeeded), i});
      }
      hm.put(nums[i], i);
    }

    return result;
  }

}
