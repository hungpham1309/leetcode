package grokkingcodingitv.subset;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

  /**
   * Input: [1,3,5] Output: [1,3,5], [1,5,3], [3,1,5], [3,5,1], [5,1,3], [5,3,1]
   */
  public List<List<Integer>> findAllPermutations(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    List<List<Integer>> permutations = new ArrayList<>();
    permutations.add(new ArrayList<>());
    for (int i = 0; i < nums.length; i++) {
      int size = permutations.size();
      for (int j = 0; j < size; j++) {
        for (int k = 0 ; k <= permutations.size(); k ++) {

        }
      }
    }

//    result.addAll(permutations);

    return result;
  }

}
