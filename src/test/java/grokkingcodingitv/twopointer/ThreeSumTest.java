package grokkingcodingitv.twopointer;


import static org.assertj.core.api.Assertions.assertThat;

import grokkingcodingitv.AllTwoSum;
import java.util.Arrays;
import org.junit.Test;

public class ThreeSumTest {


  ThreeSum threeSum = new ThreeSum();

  /**
   * find all the triplet of an array that adds up to ZERO
   *
   * Input: [-3, 0, 1, 2, -1, 1, -2]
   * Output: [-3, 1, 2], [-2, 0, 2], [-2, 1, 1], [-1, 0, 1]
   */
  @Test
  public void testCase1() {

    var nums = new int[]{-3, 0, 1, 2, -1, 1, -2};

    var actual = threeSum.findAllTripletToZero(nums);
    assertThat(actual).containsExactlyInAnyOrder(Arrays.asList(-3, 1, 2),
        Arrays.asList(-2, 0, 2),
        Arrays.asList(-2, 1, 1),
        Arrays.asList(-1, 0, 1));
  }


  /**
   * find all the triplet of an array that adds up to ZERO
   *
   * Input: [-1,0,1,2,-1,-4] -4, -1, -1 , 0, 1, 2
   * Output: [[-1,-1,2],[-1,0,1]]
   */
  @Test
  public void shouldNotDuplicate() {

    var nums = new int[]{-1,0,1,2,-1,-4};

    var actual = threeSum.findAllTripletToZero(nums);
    assertThat(actual).containsExactlyInAnyOrder(Arrays.asList(-1,0,1),
        Arrays.asList(-1,-1,2));
  }

  /**
   * find all the triplet of an array that adds up to ZERO
   *
   * Input: [-2,0,0,2,2]
   * Output: [[-2,0,2]]
   */
  @Test
  public void shouldNotDuplicate2() {

    var nums = new int[]{-2,0,0,2,2};

    var actual = threeSum.findAllTripletToZero(nums);
    assertThat(actual).containsExactlyInAnyOrder(Arrays.asList(-2,0,2));
  }

}