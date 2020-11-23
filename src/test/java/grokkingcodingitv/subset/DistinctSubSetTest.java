package grokkingcodingitv.subset;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.Test;


public class DistinctSubSetTest  {
  private DistinctSubSet distinctSubSet = new DistinctSubSet();

  /**
   * Input: [1,2,2]
   * Output: [
   *   [2],
   *   [1],
   *   [1,2,2],
   *   [2,2],
   *   [1,2],
   *   []
   * ]
   */
  @Test
  public void shouldReturnResultWhenFindDistinctSubSet2() {
    var actual = distinctSubSet.findDistinctSubset(new int[]{1,2,2});

    List<List<Integer>> expected = new ArrayList<>();
    expected.add(Collections.EMPTY_LIST);
    expected.add(List.of(1));
    expected.add(List.of(2));
    expected.add(List.of(1,2));
    expected.add(List.of(2,2));
    expected.add(List.of(1,2,2));

    assertThat(actual).isEqualTo(expected);
  }


  /**
   * Input: [5,5,5,5,5]
   * Output: [[],[5],[5,5],[5,5,5],[5,5,5,5],[5,5,5,5,5]]
   */
  @Test
  public void shouldReturnResultWhenFindDistinctSubSet() {
    var actual = distinctSubSet.findDistinctSubset(new int[]{5,5,5,5,5});

    List<List<Integer>> expected = new ArrayList<>();
    expected.add(Collections.EMPTY_LIST);
    expected.add(List.of(5));
    expected.add(List.of(5,5));
    expected.add(List.of(5,5,5));
    expected.add(List.of(5,5,5,5));
    expected.add(List.of(5,5,5,5,5));

    assertThat(actual).isEqualTo(expected);
  }
}