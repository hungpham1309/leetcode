package io.hieuthinhcse.code.graph;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/***
 * Example 5:
 *
 * Input: N = 4, trust = [[1,3],[1,4],[2,3],[2,4],[4,3]]
 * Output: 3
 */

public class findTheTownJudgeTest {

  final findTheTownJudge finder = new findTheTownJudge();

  /***
   * Example 1:
   * Input: N = 2, trust = [[1,2]]
   * Output: 2
   */
  @Test
  public void testCase1() {

    var N = 2;
    var trust = new int[][]{
        {1, 2}
    };

    assertEquals(finder.findJudge(N, trust), 2);
  }

  /***
   * Example 2:
   * Input: N = 3, trust = [[1,3],[2,3]]
   * Output: 3
   */
  @Test
  public void testCase2() {

    var N = 3;
    var trust = new int[][]{
        {1, 3},
        {2, 3}
    };

    assertEquals(finder.findJudge(N, trust), 3);
  }

  /***
   * Example 3:
   *
   * Input: N = 3, trust = [[1,3],[2,3],[3,1]]
   * Output: -1
   */
  @Test
  public void testCase3() {

    var N = 3;
    var trust = new int[][]{
        {1, 3},
        {2, 3},
        {3, 1}
    };

    assertEquals(finder.findJudge(N, trust), -1);
  }

  /***
   * Example 4:
   *
   * Input: N = 3, trust = [[1,2],[2,3]]
   * Output: -1
   */
  @Test
  public void testCase4() {

    var N = 3;
    var trust = new int[][]{
        {1, 2},
        {2, 3}
    };

    assertEquals(finder.findJudge(N, trust), -1);
  }

  /***
   * Example 5:
   *
   * Input: N = 4, trust = [[1,3],[1,4],[2,3],[2,4],[4,3]]
   * Output: 3
   */
  @Test
  public void testCase5() {

    var N = 4;
    var trust = new int[][]{
        {1, 3},
        {1, 4},
        {2, 3},
        {2, 4},
        {4, 3}
    };

    assertEquals(finder.findJudge(N, trust), 3);
  }

  @Test
  public void testCase6() {

    var N = 1;
    var trust = new int[][]{};

    assertEquals(finder.findJudge(N, trust), 1);
  }

  @Test
  public void testCase7() {

    var N = 2;
    var trust = new int[][]{};

    assertEquals(finder.findJudge(N, trust), -1);
  }


}
