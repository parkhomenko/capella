package com.hillel.triangle;

public class Triangle {

  public static void main(String[] args) {
    int[][] triangle = new int[6][];
    for(int i = 0; i < triangle.length; i++) {
      triangle[i] = new int[i + 1];
      triangle[i][0] = 1;
      triangle[i][i] = 1;
      for(int j = 1; j < triangle[i].length - 1; j++) {
        triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
      }
    }

  }

}
