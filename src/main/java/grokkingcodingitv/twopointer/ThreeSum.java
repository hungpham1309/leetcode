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
        int sum = firstElement + a[leftPointer] + a[rightPointer];
        if (sum == 0) {
//             * Input: [-2,0,0,2,2]

          result.add(Arrays.asList(firstElement, a[leftPointer], a[rightPointer]));
          rightPointer--;
          leftPointer++;
          while (leftPointer < rightPointer && a[leftPointer] == a[leftPointer - 1]) {
            leftPointer++;
          }
          while (leftPointer < rightPointer && a[rightPointer] == a[rightPointer + 1]) {
            rightPointer--;
          }
        }
        if (sum > 0) {
          rightPointer--;
        }
        if (sum < 0) {
          leftPointer++;
        }
      }
    }

    result.toArray();

    return result;
  }

  public int findSumOfTripletClosestToGivenArray(int[] a, int target) {

    Arrays.sort(a);
    int smallestDifference = Integer.MAX_VALUE;
    for (int i = 0; i < a.length - 2; i++) {
      int left = i + 1, right = a.length - 1;
      while (left < right) {
        // comparing the sum of three numbers to the 'targetSum' can cause overflow
        // so, we will try to find a target difference
        int targetDiff = target - a[i] - a[left] - a[right];
        if (targetDiff == 0) //  we've found a triplet with an exact sum
          return target - targetDiff; // return sum of all the numbers

        // the second part of the above 'if' is to handle the smallest sum when we have more than one solution
        if (Math.abs(targetDiff) < Math.abs(smallestDifference)
            || (Math.abs(targetDiff) == Math.abs(smallestDifference) && targetDiff > smallestDifference))
          smallestDifference = targetDiff; // save the closest and the biggest difference

        if (targetDiff > 0)
          left++; // we need a triplet with a bigger sum
        else
          right--; // we need a triplet with a smaller sum
      }
    }
    return target - smallestDifference;
  }
}
