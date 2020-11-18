package grokkingcodingitv.subset;


import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.Test;

public class SubsetsTest {

  Subsets subsets = new Subsets();

  /**
   * Input: [1, 5, 3]
   * Output: [], [1], [5], [3], [1,5], [1,3], [5,3], [1,5,3]
   */
  @Test
  public void shouldReturnResultWhenFindSubSet() {
    var actual = subsets.findSubsets(new int[]{1,5,3});

    List<List<Integer>> expected = new ArrayList<>();
    expected.add(Collections.EMPTY_LIST);
    expected.add(List.of(1));
    expected.add(List.of(5));
    expected.add(List.of(1,5));
    expected.add(List.of(3));
    expected.add(List.of(1,3));
    expected.add(List.of(5,3));
    expected.add(List.of(1,5,3));

    assertThat(actual).isEqualTo(expected);
  }

}