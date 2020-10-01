package io.hieuthinhcse.code.graph;

//In a town, there are N people labelled from 1 to N.  There is a rumor that one of these people is secretly the town judge.
//
//If the town judge exists, then:
//
//    1. The town judge trusts nobody.
//    2. Everybody (except for the town judge) trusts the town judge.
//    3. There is exactly one person that satisfies properties 1 and 2.
//You are given trust, an array of pairs trust[i] = [a, b] representing that the person labelled a trusts the person labelled b.
//
//If the town judge exists and can be identified, return the label of the town judge.  Otherwise, return -1.

//Constraints:
//
//    1 <= N <= 1000
//    0 <= trust.length <= 10^4
//    trust[i].length == 2
//    trust[i] are all different
//    trust[i][0] != trust[i][1]
//    1 <= trust[i][0], trust[i][1] <= N

import java.util.HashMap;

public class findTheTownJudge {

  private int findJudgeHash(int N, int[][] trust) {
    if (N == 1 && trust.length == 0) {
      return N;
    }

    var hash = new HashMap<Integer, Integer>();
    var truster = new HashMap<Integer, Boolean>();

    for (int i = 0; i < trust.length; i++) {
      var t = trust[i];

      truster.put(t[0], true);

      if (hash.getOrDefault(t[1], 0).equals(0)) {
        hash.put(t[1], 1);
      } else {
        hash.put(t[1], hash.get(t[1]) + 1);
      }
    }

    for (var entry : hash.entrySet()) {
      if (entry.getValue() == N - 1
          && !truster.getOrDefault(entry.getKey(), false)
      ) {

        return entry.getKey();
      }
    }

    return -1;
  }

  public int findJudge(int N, int[][] trust) {
    if (N == 1 && trust.length == 0) {
      return N;
    }

    var totalTrust = new int[N];
    var truster = new boolean[N];

    for (int i = 0; i < trust.length; i++) {
      var t = trust[i];

      truster[t[0] - 1] = true;
      totalTrust[t[1] - 1]++;
    }

    for (var i = 0; i < N; i++) {
      var entry = totalTrust[i];

      if (entry == N - 1 && !truster[i]) {
        return i + 1;
      }
    }

    return -1;
  }
}
