package db;


import com.mysql.cj.protocol.Resultset;

import javax.swing.*;
import java.sql.*;
import java.util.*;

public class DBOperacijos {

  private PrisijungimasDB prisijungimasDB;
  private Connection connection; // null

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

  public List<String> getZanrai(){

    prisijungimasDB = new PrisijungimasDB();
    connection = prisijungimasDB.prisijungti();

    List<String> zanrai = new ArrayList<>();
    //language=MySQL
    String sql = "select distinct zanras from zaidimas";
    try {
      PreparedStatement preparedStatement = connection.prepareStatement(sql);
      ResultSet rs = preparedStatement.executeQuery();
      while (rs.next()){
        zanrai.add(rs.getString(1));
      }

    } catch (SQLException e) {
      e.printStackTrace();
    }


    return zanrai;
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
