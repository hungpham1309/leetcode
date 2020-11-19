package grokkingcodingitv.slidingwindow;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class SlidingWindowTest {
  SlidingWindow slidingWindow = new SlidingWindow();

  @Test
  public void shouldReturnResultWhenSmallestSubArraySumK() {
    int actual = slidingWindow.smallestSubArrayWithSumGreaterS(new int[]{2, 1, 5, 2, 3, 2}, 7);

    assertThat(actual).isEqualTo(2);
  }

  @Test
  public void shouldReturnResultWhenSmallestSubArraySumK2() {
    int actual = slidingWindow.smallestSubArrayWithSumGreaterS(new int[]{2, 1, 5, 2, 8}, 8);

    assertThat(actual).isEqualTo(1);
  }

  @Test
  public void shouldReturnResultWhenSmallestSubArraySumK3() {
    int actual = slidingWindow.smallestSubArrayWithSumGreaterS(new int[]{3, 4, 1, 1, 6}, 8);

    assertThat(actual).isEqualTo(3);
  }

  @Test
  public void shouldReturnResultWhenLongestSubstringWithKDistinct1() {
    int actual = slidingWindow.longestSubstringWithKDistinct("araaci", 2);

    assertThat(actual).isEqualTo(4);
  }


  /**
   * Input: [2, 1, 5, 1, 3, 2], k=3
   * Output: 9
   * Explanation: Subarray with maximum sum is [5, 1, 3].
   */
  @Test
  public void shouldReturnResultWhenMaxSubarrayK(){

    int actual = slidingWindow.maxSubArrayK(new int[]{2, 1, 5, 1, 3, 2}, 3);

    assertThat(actual).isEqualTo(9);

  }

  /**
   * Input: Fruit=['A', 'B', 'C', 'A', 'C']
   * Output: 3
   * Explanation: We can put 2 'C' in one basket and one 'A' in the other from the subarray ['C', 'A', 'C']
   */
  @Test
  public void shouldReturnResultWhenPutFruitIn2Baskets() {
    int actual = slidingWindow.putFruitInto2Baskets(new char[] {'A', 'B', 'C', 'A', 'C'});

    assertThat(actual).isEqualTo(3);
  }

  /**
   * Input: Fruit=['A', 'B', 'C', 'B', 'B', 'C']
   * Output: 5
   * Explanation: We can put 3 'B' in one basket and two 'C' in the other basket.
   * This can be done if we start with the second letter: ['B', 'C', 'B', 'B', 'C']
   */
  @Test
  public void shouldReturnResultWhenPutFruitIn2Baskets2() {
    int actual = slidingWindow.putFruitInto2Baskets(new char[] {'A', 'B', 'C', 'B', 'B', 'C'});

    assertThat(actual).isEqualTo(5);
  }
}