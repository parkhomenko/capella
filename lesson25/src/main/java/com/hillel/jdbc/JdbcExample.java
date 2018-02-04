package com.hillel.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcExample {

  public static void main(String[] args) throws SQLException, IOException {

    Properties properties = new Properties();
    properties.load(JdbcExample.class.getClassLoader().getResourceAsStream("/db.properties"));

    Connection connection = DriverManager
        .getConnection(properties.getProperty("url"),
            properties.getProperty("username"),
            properties.getProperty("password"));
    System.out.println("Connected");

    //printStudents(connection);

    Student student = new Student("John", "Doe", 32);
    addStudent(connection, student);
  }

  public static void printStudents(Connection connection) {
    String sql = "select * from students";

    try (Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql)) {

      while (resultSet.next()) {
        String firstName = resultSet.getString("firstname");
        String lastName = resultSet.getString("lastname");
        int age = resultSet.getInt("age");
        System.out.println(firstName + " " + lastName + " " + age);
      }

    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public static void addStudent(Connection connection, Student student) {

    /*String sql = "insert into students(firstname, lastname, age) " +
        "values('" + student.getFirstname() + "', '"
        + student.getLastname() +"', " + student.getAge() +
        ")";*/

    String sql = "insert into students(firstname, lastname, age) " +
        "values(?, ?, ?)";

    try (PreparedStatement statement = connection.prepareStatement(sql)) {
      statement.setString(1, student.getFirstname());
      statement.setString(2, student.getLastname());
      statement.setInt(3, student.getAge());
      statement.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }

  }

  public static void insertStudents(Connection connection) {
    String sql1 = "insert into students(firstname, lastname, age) " +
        "values('John', 'Doe', 25)";
    String sql2 = "insert into students(firstname, lastname, age) " +
        "values('Mark', 'Twain', 35)";

    try {
      connection.setAutoCommit(false);

      Statement statement = connection.createStatement();
      statement.executeUpdate(sql1);
      statement.executeUpdate(sql2);
      connection.commit();

    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        connection.rollback();
        connection.setAutoCommit(true);
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }
}
