package grokkingcodingitv.subset;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Permutations {

  /**
   * Input: [1,3,5] Output: [1,3,5], [1,5,3], [3,1,5], [3,5,1], [5,1,3], [5,3,1]
   */
  public List<List<Integer>> findAllPermutations(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();

    Queue<List<Integer>> permutations = new LinkedList<>();
    permutations.add(new ArrayList<>());

    for (int num : nums) {
      int size = permutations.size();
      for (int i = 0; i < size; i++) {
        List<Integer> oldPermutation = permutations.poll();
        for (int j = 0; j <= oldPermutation.size(); j++) {
          List<Integer> newPermutation = new ArrayList<>(oldPermutation);
          newPermutation.add(j, num);

          if (newPermutation.size() == nums.length) {
            result.add(newPermutation);
          } else {
            permutations.add(newPermutation);
          }
        }
      }
    }

    return result;
  }

  public List<List<Character>> findAllPermutations(char[] chars) {
    List<List<Character>> result = new ArrayList<>();

    Queue<List<Character>> permutations = new LinkedList<>();
    permutations.add(new ArrayList<>());

    for (char num : chars) {
      int size = permutations.size();
      for (int i = 0; i < size; i++) {
        List<Character> oldPermutation = permutations.poll();
        for (int j = 0; j <= oldPermutation.size(); j++) {
          List<Character> newPermutation = new ArrayList<>(oldPermutation);
          newPermutation.add(j, num);

          if (newPermutation.size() == chars.length) {
            result.add(newPermutation);
          } else {
            permutations.add(newPermutation);
          }
        }
      }
    }

    return result;
  }

}
