package com.hillel;

public class Board {

  private char[][] field = new char[3][3];

  public Board() {
    fillBoard();
  }

  private void fillBoard() {
  }

  public void fillCell(int x, int y, char value) { // 1    1
    field[--x][--y] = value; //field[0][0]
  }

  public void print() {

  }

  public boolean isFilled() {
    return false;
  }

  public boolean isWinningCombination() {
    return false;
  }

}
