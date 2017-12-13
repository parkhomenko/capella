package com.hillel.animals;

public class Main {

  public static void main(String[] args) {
    Animal animal = new Animal();
    animal.eat();
    animal.growUp();

    Dog dog = new Dog();
    dog.walk();
    dog.eat();
    dog.growUp();

    Animal cat = new Cat("Murzik", "persian");
    Animal dog1 = new Dog();
    //Object obj = cat;

    cat.voice();
    dog1.voice();

    Animal[] animals = new Animal[5];

    animals[0] = cat;
    animals[1] = dog1;
    animals[2] = new Dog();

    for (Animal a : animals) {
      if (a != null) {
        a.voice();
      }
    }
  }

}
