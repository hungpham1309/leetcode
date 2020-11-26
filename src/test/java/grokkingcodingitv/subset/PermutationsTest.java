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
    expected.add(List.of(5, 3, 1));
    expected.add(List.of(3, 5, 1));
    expected.add(List.of(3, 1, 5));
    expected.add(List.of(5, 1, 3));
    expected.add(List.of(1, 5, 3));
    expected.add(List.of(1, 3, 5));


    assertThat(actual).isEqualTo(expected);
  }


  /**
   * Input: [1,3,5]
   * Output: [1,3,5], [1,5,3], [3,1,5], [3,5,1], [5,1,3], [5,3,1]
   */
  @Test
  public void shouldReturnResultWhenFindPermutation2() {
    var actual = permutations.findAllPermutations(new int[]{1});

    List<List<Integer>> expected = new ArrayList<>();
    expected.add(List.of(1));

    assertThat(actual).isEqualTo(expected);
  }

  /**
   * Input: [1,3]
   * Output: [1,3], [3,1]
   */
  @Test
  public void shouldReturnResultWhenFindPermutation3() {
    var actual = permutations.findAllPermutations(new int[]{1,3});

    List<List<Integer>> expected = new ArrayList<>();
    expected.add(List.of(3,1));
    expected.add(List.of(1,3));

    assertThat(actual).isEqualTo(expected);
  }

  /**
   * Input: [A,B,C]
   * Output: [A,B,C], [A,C,B], [B,A,C], [B,C,A], [C,A,B], [C,B,A]
   */
  @Test
  public void shouldReturnResultWhenFindPermutation4() {
    var actual = permutations.findAllPermutations(new char[]{'A','B','C'});

    List<List<Character>> expected = new ArrayList<>();
    expected.add(List.of('C', 'B', 'A'));
    expected.add(List.of('B', 'C', 'A'));
    expected.add(List.of('B', 'A', 'C'));
    expected.add(List.of('C', 'A', 'B'));
    expected.add(List.of('A', 'C', 'B'));
    expected.add(List.of('A', 'B', 'C'));

    assertThat(actual).isEqualTo(expected);
  }
}