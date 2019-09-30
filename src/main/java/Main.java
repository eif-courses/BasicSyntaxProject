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
        "First person shooter",
        Platforma.PC,
        description);

    dbOperacijos.insert(cs.getZanras(), cs.getPlatforma().name());





  }
}
