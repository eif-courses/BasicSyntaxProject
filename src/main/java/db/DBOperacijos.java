package db;


import javax.swing.*;
import java.sql.*;
import java.util.Random;

public class DBOperacijos {

  private PrisijungimasDB prisijungimasDB;
  private Connection connection;

  public void insert(String zanras, String platforma){
    prisijungimasDB = new PrisijungimasDB();
    connection = prisijungimasDB.prisijungti();

    String sql = "insert into zaidimai.zaidimas values (?, ?, ?)";
    try {
      PreparedStatement preparedStatement = connection.prepareStatement(sql);
      preparedStatement.setInt(1, new Random().nextInt(99999));
      preparedStatement.setString(2, zanras);
      preparedStatement.setString(3, platforma);
      preparedStatement.executeUpdate();
      System.out.println("Inserted new Record!");
    } catch (SQLException e) {
      JOptionPane.showMessageDialog(null, zanras+": toks gyvunas jau egzistuoja");
      e.printStackTrace();
    }
  }
  public void atvaizduoti(){

    String sakinysSQL = "select * from zaidimas";
    try {
      PreparedStatement preparedStatement = connection.prepareStatement(sakinysSQL);
      ResultSet rs = preparedStatement.executeQuery();

      while (rs.next()){
        System.out.println(
            rs.getInt(1)+
            rs.getString(2)+
            rs.getString("platforma"));
      }


    } catch (SQLException e) {
      e.printStackTrace();
    }

  }



}
