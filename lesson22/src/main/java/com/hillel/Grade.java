package com.hillel;

public class Grade {

  private String name;  //good, excellent
  private int number;  //3, 4, 5
  private String letter;  //A, B, C, E, F

  public Grade(String name, int number, String letter) {
    this.name = name;
    this.number = number;
    this.letter = letter;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Grade grade = (Grade) o;

    if (number != grade.number) {
      return false;
    }
    if (!name.equals(grade.name)) {
      return false;
    }
    return letter.equals(grade.letter);
  }

  @Override
  public int hashCode() {
    int result = name.hashCode();
    result = 31 * result + number;
    result = 31 * result + letter.hashCode();
    return result;
  }
}
