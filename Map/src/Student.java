public class Student extends Human {

  Student(String name, int age){
    this.name = name;
    this.age = age;
  }


  // переопределение
  public String getName(){
    super.getName(); // обратиться с методу родителя
    // а после выполднить дополнительные действия
    //

    return "STUDENT: " + this.name;
  }

}
