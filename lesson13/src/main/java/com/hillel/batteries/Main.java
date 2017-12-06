package com.hillel.batteries;

import com.hillel.Flashlight;

public class Main {

  public static void main(String[] args) {
    /*Cat barsik = new Cat();
    barsik.name = "Barsik";
    barsik.age = 5;

    Cat murzik = new Cat();
    murzik.name = "Murzik";
    murzik.age = 3;

    murzik.name = "Kesha";*/

    Flashlight flashlight = new Flashlight();
    flashlight.addBattery();
    flashlight.addBattery();
    flashlight.addBattery();

    flashlight.shines();
  }
}
