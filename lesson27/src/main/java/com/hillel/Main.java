package com.hillel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

  public static void main(String[] args) throws IOException, ClassNotFoundException {

    Owner owner = new Owner("John", 34);
    Dog dog = new Dog("Sharik", 5, owner);

    //serializeDog(dog);

    Dog dog2 = deserializeDog();

    System.out.println(dog2);

  }

  public static void serializeDog(Dog dog) throws IOException {
    FileOutputStream fout = new FileOutputStream("C:\\Users\\User\\Projects\\lesson27\\dog.ser");
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fout);
    objectOutputStream.writeObject(dog);
  }

  public static Dog deserializeDog() throws IOException, ClassNotFoundException {
    FileInputStream fin = new FileInputStream("C:\\Users\\User\\Projects\\lesson27\\dog.ser");
    ObjectInputStream objectInputStream = new ObjectInputStream(fin);
    return  (Dog) objectInputStream.readObject();
  }
}
