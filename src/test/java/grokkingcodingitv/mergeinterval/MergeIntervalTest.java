package grokkingcodingitv.mergeinterval;


import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class MergeIntervalTest {

  MergeInterval mergeInterval = new MergeInterval();

  @Test
  public void shouldReturnResult() {
    List<Interval> input = Arrays.asList(
        new Interval(1, 4),
        new Interval(2, 5),
        new Interval(7, 9)
    );

    List<Interval> result = mergeInterval.findAllMergeInterval(input);

    assertThat(result).extracting(interval -> interval.start).containsExactlyInAnyOrder(1,7);
    assertThat(result).extracting(interval -> interval.end).containsExactlyInAnyOrder(5,9);

  }


  @Test
  public void shouldReturnResult2() {
    var input = new ArrayList<Interval>();
    input.add(new Interval(6, 7));
    input.add(new Interval(2, 4));
    input.add(new Interval(5, 9));

    List<Interval> result = mergeInterval.findAllMergeInterval(input);

    assertThat(result).extracting(interval -> interval.start).containsExactlyInAnyOrder(2,5);
    assertThat(result).extracting(interval -> interval.end).containsExactlyInAnyOrder(4,9);

  }


  @Test
  public void shouldReturnResult3() {
    var input = new ArrayList<Interval>();
    input.add(new Interval(1, 4));
    input.add(new Interval(2, 6));
    input.add(new Interval(3, 5));

    List<Interval> result = mergeInterval.findAllMergeInterval(input);

    assertThat(result).extracting(interval -> interval.start).containsExactlyInAnyOrder(1);
    assertThat(result).extracting(interval -> interval.end).containsExactlyInAnyOrder(6);

  }

}
