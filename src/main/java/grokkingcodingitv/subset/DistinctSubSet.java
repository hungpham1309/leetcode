package grokkingcodingitv.subset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DistinctSubSet {

  /**
   * Subset but with duplicate input Input: [1, 3, 3] Output: [], [1], [3], [1,3], [3,3], [1,3,3]
   * <p>
   * Input: [1, 5, 3, 3] Output: [], [1], [5], [3], [1,5], [1,3], [5,3], [1,5,3], [3,3], [1,3,3],
   * [3,3,5], [1,5,3,3]
   */
  public List<List<Integer>> findDistinctSubset(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> result = new ArrayList<>();
    result.add(new ArrayList<>());
    List<List<Integer>> remember = new ArrayList<>();

    for (int i = 0; i < nums.length; i++) {
      if (i > 0 && nums[i] == nums[i - 1]) {
        List<Integer> temp = new ArrayList<>();
        for (List<Integer> integers : remember) {
          temp = new ArrayList<>(integers);
          temp.add(nums[i]);
          result.add(temp);
        }
        remember.add(temp);
        continue;
      } else {
        remember = new ArrayList<>();
      }
      int size = result.size();
      for (int j = 0; j < size; j++) {
        List<Integer> temp = new ArrayList<>(result.get(j));
        temp.add(nums[i]);
        result.add(temp);
        remember.add(temp);
      }
    }

    return result;
  }
}
