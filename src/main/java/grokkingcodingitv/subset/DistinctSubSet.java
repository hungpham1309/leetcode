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
    int start ;
    int end = 0;

    for (int i = 0; i < nums.length; i++) {
      start = 0;
      if (i > 0 && nums[i] == nums[i-1]) {
        start = end +1;
      }
      end = result.size()-1;
      for (int j = start; j <= end; j++) {
        List<Integer> temp = new ArrayList<>(result.get(j));
        temp.add(nums[i]);
        result.add(temp);
      }
    }

    return result;
  }
}
