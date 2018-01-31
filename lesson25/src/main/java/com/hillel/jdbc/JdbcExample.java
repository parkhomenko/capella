package com.hillel.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample {

  public static void main(String[] args) throws SQLException {
    Connection connection = DriverManager
        .getConnection("jdbc:mysql://localhost:3306/school?serverTimezone=UTC&useSSL=false",
            "root", "ршддуд");
    System.out.println("Connected");

    printStudents(connection);
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
}
