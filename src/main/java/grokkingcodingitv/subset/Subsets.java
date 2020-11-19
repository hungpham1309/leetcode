package grokkingcodingitv.subset;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

  /**
   * No duplicate
   * Input: [1, 3] Output: [], [1], [3], [1,3]
   */
  public List<List<Integer>> findSubsets(int[] nums) {

    List<List<Integer>> result = new ArrayList<>();

    result.add(new ArrayList<>());
    for (int num : nums) {
      var size = result.size();
      for (int j = 0; j < size; j++) {
        List<Integer> temp = new ArrayList<>(result.get(j));
        temp.add(num);
        result.add(temp);
      }
    }
    return result;
  }


}
