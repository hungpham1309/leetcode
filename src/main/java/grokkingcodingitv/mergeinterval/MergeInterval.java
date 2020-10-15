package grokkingcodingitv.mergeinterval;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MergeInterval {

  public List<Interval> findAllMergeInterval(List<Interval> intervalList) {

    intervalList.sort(Comparator.comparingInt(o -> o.start));
    List<Interval> result = new ArrayList<>();

    int start = intervalList.get(0).start;
    int end = intervalList.get(0).end;
    for (Interval temp : intervalList) {
      if (end >= temp.start) {
        end = Math.max(end, temp.end);
      } else {
        result.add(new Interval(start, end));

        start = temp.start;
        end = temp.end;
      }

    }

    result.add(new Interval(start,end));
    return result;
  }
}
