package grokkingcodingitv.subset;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class PermutationsTest {

  private Permutations permutations = new Permutations();


  /**
   * Input: [1,3,5]
   * Output: [1,3,5], [1,5,3], [3,1,5], [3,5,1], [5,1,3], [5,3,1]
   */
  @Test
  public void shouldReturnResultWhenFindPermutation() {
    var actual = permutations.findAllPermutations(new int[]{1,3,5});

    List<List<Integer>> expected = new ArrayList<>();
    expected.add(List.of(1,3,5));
    expected.add(List.of(1,5,3));
    expected.add(List.of(3,1,5));
    expected.add(List.of(3,5,1));
    expected.add(List.of(5,1,3));
    expected.add(List.of(5,3,1));


    assertThat(actual).isEqualTo(expected);
  }
}