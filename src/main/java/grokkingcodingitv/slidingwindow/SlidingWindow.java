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


}
