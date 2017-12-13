package com.hillel;

import java.util.Scanner;

public class Game {

  private static final char X = 'X';

  private Board board;
  private Player player1;
  private Player player2;

  private Player currentPlayer;

  public Game(Player player1, Player player2) {
    board = new Board();

    this.player1 = player1;
    this.player2 = player2;

    setCurrentPlayer();
  }

  public String play() {
    while (!gameFinished()) {
      makeMove();
      changePlayer();
      board.print();
    }

    return gameResult();
  }

  private String gameResult() {
    changePlayer();

    if (board.isWinningCombination()) {
      return "Победитель: " + currentPlayer.getName();
    }

    if (board.isFilled()) {
      return "Ничья";
    } else {
      return "Еще в процессе";
    }

  }

  private void changePlayer() {
    if (currentPlayer == player1) {
      currentPlayer = player2;
    } else {
      currentPlayer = player1;
    }
  }

  private void makeMove() {
    //Scanner scanner ...
  }

  private boolean gameFinished() {
    return board.isFilled()
        || board.isWinningCombination();
  }

  private void setCurrentPlayer() {
    if (player1.getSymbol() == X) {
      currentPlayer = player1;
    } else {
      currentPlayer = player2;
    }
  }

}
