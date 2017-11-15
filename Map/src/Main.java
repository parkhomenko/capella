/**
 * Created by User on 13.11.2017.
 */
public class Main {

  public static void main(String[] args) {
    // логика программы

    Human student = new Student("Serj", 20); // создаем объект
    System.out.println(student.getName());

    Human human = new Human( "Dmitriy", 20);
    System.out.println(human.getName());  // создаем объект
  }

}
