package grokkingcodingitv;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AllTwoSumTest {

  AllTwoSum allTwoSum = new AllTwoSum();

  /***
   * Example 1:
   * Input: nums = [2,7,11,15], target = 9 Output: [0,1]
   */
  @Test
  public void testCase1() {

    var nums = new int[]{2,7,11,8};

    var target = 13;

    assert
    assertArrayEquals(new int[]{0, 1}, allTwoSum.twoSum(nums, target));
  }
}