package grokkingcodingitv.cyclicsort;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class CyclicSortTest {

  public CyclicSort cyclicSort = new CyclicSort();

  @Test
  public void shouldReturnResult() {
    int[] nums = new int[]{1, 5, 6, 4, 2, 3};
    cyclicSort.cyclicSort(nums);

    int[] expected = new int[]{1, 2, 3, 4, 5, 6};

    assertThat(nums).isEqualTo(expected);
  }

  @Test
  public void shouldReturnResult2() {
    int[] nums = new int[]{3, 1, 5, 4, 2};
    cyclicSort.cyclicSort(nums);

    int[] expected = new int[]{1, 2, 3, 4, 5};

    assertThat(nums).isEqualTo(expected);
  }

  @Test
  public void shouldReturnResult3() {
    int[] nums = new int[]{2, 6, 4, 3, 1, 5};
    cyclicSort.cyclicSort(nums);

    int[] expected = new int[]{1, 2, 3, 4, 5, 6};

    assertThat(nums).isEqualTo(expected);
  }

  @Test
  public void shouldReturnResult4() {
    int[] nums = new int[]{1, 5, 6, 4, 3, 2};
    cyclicSort.cyclicSort(nums);

    int[] expected = new int[]{1, 2, 3, 4, 5, 6};

    assertThat(nums).isEqualTo(expected);
  }
}