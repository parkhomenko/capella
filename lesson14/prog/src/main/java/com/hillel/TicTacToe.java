package com.hillel;

public class TicTacToe {

  public static void main(String[] args) {

    char[][] field = new char[3][3];

    char currentPlayer = 'X';
    fillBoard(field);

    while (!gameFinished()) {
      String coords;
      do {
        coords = inputCoordinates();
      } while (!validateCoordinates(coords));
      makeMove(field, coords, currentPlayer);
      currentPlayer = switchCurrentPlayer(currentPlayer);
    }

    calculateWinner();
  }

}
