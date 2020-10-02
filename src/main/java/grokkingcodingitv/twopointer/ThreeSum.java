package grokkingcodingitv.twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

  /**
   * find all the triplet of an array that adds up to ZERO
   * <p>
   * Input: [-3, 0, 1, 2, -1, 1, -2] Output: [-3, 1, 2], [-2, 0, 2], [-2, 1, 1], [-1, 0, 1]
   */


  public List<List<Integer>> findAllTripletToZero(int[] a) {
    List<List<Integer>> result = new ArrayList<>();

    Arrays.sort(a);

    for (int i = 0; i < a.length - 1; i++) {
      if (i > 0 && a[i] == a[i - 1]) {
        continue;
      }
      int firstElement = a[i];

      int leftPointer = i + 1;
      int rightPointer = a.length - 1;

      while (leftPointer < rightPointer) {
        if (leftPointer > 0 && a[leftPointer] == a[leftPointer - 1]) {
          rightPointer--;
          leftPointer++;
          continue;
        }
        int sum = firstElement + a[leftPointer] + a[rightPointer];
        if (sum == 0) {
          result.add(Arrays.asList(firstElement, a[leftPointer], a[rightPointer]));
          rightPointer--;
          leftPointer++;
        }
        if (sum > 0) {
          rightPointer--;
        }
        if (sum < 0) {
          leftPointer++;
        }
      }
    }

    return result;
  }
}
