package com.hillel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

  public static void main(String[] args) throws IOException, ClassNotFoundException {

    /*Dog dog = new Dog("Sharik", 5);

    FileOutputStream fout = new FileOutputStream("C:\\Users\\User\\Projects\\lesson27\\dog.ser");
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fout);
    objectOutputStream.writeObject(dog);*/

    FileInputStream fin = new FileInputStream("C:\\Users\\User\\Projects\\lesson27\\dog.ser");
    ObjectInputStream objectInputStream = new ObjectInputStream(fin);
    Dog dog = (Dog) objectInputStream.readObject();

    System.out.println(dog);

  }
}
