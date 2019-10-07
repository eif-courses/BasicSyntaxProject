import db.DBOperacijos;
import kategorija.CS;
import kategorija.Platforma;
import kategorija.Zaidimas;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    DBOperacijos dbOperacijos = new DBOperacijos();
    List<String> description = new ArrayList<>();

    Zaidimas cs = new CS(
        "Third person shooter",
        Platforma.PC,
        description);

    dbOperacijos.insert(cs.getZanras(), cs.getPlatforma().name());
    dbOperacijos.atvaizduoti();

    System.out.println("Zanru sarasas!");
    System.out.println("-----------------------------------------------");
  for (String elem: dbOperacijos.getZanrai()){
    System.out.println(elem);
  }





  }
}
