package grokkingcodingitv;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.List;
import org.hamcrest.CoreMatchers;
import org.junit.Test;

public class AllTwoSumTest {

  AllTwoSum allTwoSum = new AllTwoSum();

  /***
   * Example 1:
   * Input: nums = [2,7,11,15], target = 9 Output: [0,1]
   */
  @Test
  public void testCase1() {

    var nums = new int[]{2,7,11,6};

    var target = 13;

    var actual = allTwoSum.twoSum(nums, target);
    assertThat(actual).containsExactlyInAnyOrder(new Integer[]{0,2}, new Integer[]{1,3});
  }
}