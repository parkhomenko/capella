package com.hillel;

public class AnimalsMain {

  public static void main(String[] args) {

    /*Animal animal = new Animal();
    Dog dog = new Dog();
    Animal animal2 = new Dog();

    System.out.println(animal instanceof Animal); //true
    System.out.println(dog instanceof Animal); //true
    System.out.println(dog instanceof Dog); //true
    System.out.println(animal2 instanceof Dog); //true
    System.out.println(animal instanceof Dog); //false

    System.out.println(animal instanceof Object); //true

    System.out.println(animal.getClass().getName());
    System.out.println(dog.getClass().getName());*/

    Dog sharik = new Dog("Sharik", 5);
    Dog bobik = new Dog("Bobik", 3);
    Dog sharik2 = new Dog("Sharik", 5);

    System.out.println(sharik == bobik);
    System.out.println(sharik == sharik2);

    System.out.println(sharik.equals(bobik)); //false
    System.out.println(sharik.equals(sharik2)); //true
  }

}
