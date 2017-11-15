/**
 * Created by User on 13.11.2017.
 */
public class Human {

  protected String name;
  protected int age;

  public Human(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public Human() {
    // конструктор по умолчанию
  }

  public String getName() {
    return "HUMAN: " + name;
  }

  public void setName(String name) {
    // TODO add if check
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
