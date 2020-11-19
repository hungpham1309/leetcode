package grokkingcodingitv.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class SlidingWindow {

  /**
   * Input: [2, 1, 5, 2, 3, 2], S=7 Output: 2 Explanation: The smallest subarray with a sum greater
   * than or equal to '7' is [5, 2].
   */
  public int smallestSubArrayWithSumGreaterS(int[] a, int s) {
    int start = 0;
    int currentSum = 0;
    int result = Integer.MAX_VALUE;
    for (int i = 0; i < a.length; i++) {
      currentSum += a[i];

      while (currentSum >= s) {
        result = Math.min(result, i - start + 1);
        currentSum -= a[start];
        start++;
      }
    }
    return result;
  }

  /**
   * Input: String="araaci", K=2
   * Output: 4
   * Explanation: The longest substring with no more than '2' distinct characters is "area".
   */
  public int longestSubstringWithKDistinct(String a, int k) {
    int start = 0;
    int currentLongest = Integer.MIN_VALUE;
    Map<Character, Integer> frequencyMap = new HashMap<>();
    for (int i = 0; i < a.length(); i++) {
      frequencyMap.put(a.charAt(i), frequencyMap.getOrDefault(a.charAt(i), 0) + 1);

      while (frequencyMap.size() > k) {
        char temp = a.charAt(start);
        frequencyMap.put(temp, frequencyMap.get(temp) - 1);
        if (frequencyMap.get(temp) <= 0) frequencyMap.remove(temp);
        start++;
      }
      currentLongest = Math.max(currentLongest, i - start + 1);

    }

    return currentLongest;
  }


  public int maxSubArrayK(int[] inputs, int k) {
    int max = Integer.MIN_VALUE;
    int start = 0;
    int maxTillNow = 0;

    for (int i = 0 ; i < inputs.length; i++) {
      if (i > k-1) {
        max = Math.max(maxTillNow, max);
        maxTillNow -= inputs[start];
        start++;
      }
      maxTillNow += inputs[i];
    }
    return max;
  }

  /**
   * Input: Fruit=['A', 'B', 'C', 'A', 'C']
   * Output: 3
   * Explanation: We can put 2 'C' in one basket and one 'A' in the other from the subarray ['C', 'A', 'C']
   */
  public int putFruitInto2Baskets(char[] a) {
    int currentMax = 0;
    int start = 0;
    Map<Character, Integer> frequencyMap = new HashMap<>();
    for (int i = 0; i < a.length; i++) {
      frequencyMap.put(a[i], frequencyMap.getOrDefault(a[i], 0) + 1 );

      while (frequencyMap.size() > 2) {
        frequencyMap.put(a[start], frequencyMap.get(a[start]) - 1);
        if (frequencyMap.get(a[start]) <= 0) {
          frequencyMap.remove(a[start]);
        }
        start++;
      }

      currentMax = Math.max(currentMax, i - start + 1);
    }

    return currentMax;
  }

}
