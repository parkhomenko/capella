package com.hillel;

public class Main {

  public static void main(String[] args) {
    Student student = new Student();
    student.setFirstName("John");
    //student.setLastName("Smith");
    //student.setAge(25);

    Student2 student2 = new Student2("John", "Smith", 35);

    Student3 student3 = new Student3.Builder()
        .firstName("John")
        .lastName("Smith")
        .age(34)
        .city("Odessa")
        .address("Bunina 5")
        .build();

    Singleton singleton = Singleton.newInstance();
    singleton.hello();

    Singleton singleton1 = Singleton.newInstance();
    singleton1.hello();

    System.out.println(singleton == singleton1); //true
  }


}
