package io.hieuthinhcse.code.graph;

/**
 * There are N students in a class. Some of them are friends, while some are not. Their friendship
 * is transitive in nature. For example, if A is a direct friend of B, and B is a direct friend of
 * C, then A is an indirect friend of C. And we defined a friend circle is a group of students who
 * are direct or indirect friends.
 * <p>
 * Given a N*N matrix M representing the friend relationship between students in the class. If
 * M[i][j] = 1, then the ith and jth students are direct friends with each other, otherwise not. And
 * you have to output the total number of friend circles among all the students.
 */

public class friendCircles {

  int[] visited;

  private void bfs(int[][] M, int i) {
    for (int j = 0; j < M.length; j++) {
      if (visited[j] == 0 && M[i][j] == 1) {
        visited[j] = 1;
        bfs(M, j);
      }
    }
  }

  public int findCircleNum(int[][] M) {
    visited = new int[M.length];

    var count = 0;

    for (var i = 0; i < M.length; i++) {
      if (visited[i] == 0) {
        visited[i] = 1;

        bfs(M, i);
        count++;
      }
    }

    return count;
  }
}
