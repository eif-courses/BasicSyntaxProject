package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PrisijungimasDB {

  private Connection connection;

  public Connection prisijungti(){
    String host = "jdbc:mysql://localhost:3306/zaidimai";
    String user = "root";
    String password = "";

    try {
      connection =  DriverManager.getConnection(host, user, password);
    } catch (SQLException e) {
      e.printStackTrace();
    }
     return connection;
  }


}
