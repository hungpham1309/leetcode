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

}