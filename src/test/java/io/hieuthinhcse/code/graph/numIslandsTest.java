package io.hieuthinhcse.code.graph;

import org.junit.Test;

public class numIslandsTest {

  @Test
  public void test1() {
    var finder = new io.hieuthinhcse.code.graph.numIslands();

    char[][] islandGrid = new char[][]{
        {'1', '1', '1', '1', '0'},
        {'1', '1', '0', '1', '0'},
        {'1', '1', '0', '1', '0'},
        {'1', '1', '0', '0', '0'},
        {'0', '0', '0', '0', '0'}};

    System.out.println("No of Islands: " + finder.numIslands(islandGrid));

  }
}
