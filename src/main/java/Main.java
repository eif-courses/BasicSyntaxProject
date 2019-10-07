import db.DBOperacijos;
import exception.SarasasPerpildytasException;
import kategorija.CS;
import kategorija.Platforma;
import kategorija.Zaidimas;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
  public static void main(String[] args) {

    DBOperacijos dbOperacijos = new DBOperacijos();
    List<String> description = new ArrayList<>();

    Zaidimas cs = new CS(
        "dddd",
        Platforma.PC,
        description);

    dbOperacijos.insert(new Random().nextInt(100)+"", cs.getPlatforma().name());
    
    dbOperacijos.atvaizduoti();

    System.out.println("Zanru sarasas!");
    System.out.println("-----------------------------------------------");
    try {
      for (String elem: dbOperacijos.getZanrai()){
        System.out.println(elem);
      }
    } catch (SarasasPerpildytasException e) {
      e.printStackTrace();
    }


  }
}
