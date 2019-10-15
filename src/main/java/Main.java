import anotacijos.Developer;
import db.DBOperacijos;
import exception.SarasasPerpildytasException;
import generics.Reitingas;
import kategorija.CS;
import kategorija.Platforma;
import kategorija.Zaidimas;
import score.Score.Score;

import javax.swing.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
  public static void main(String[] args) {

//    DBOperacijos dbOperacijos = new DBOperacijos();
//    List<String> description = new ArrayList<>();
//
//    Zaidimas cs = new CS(
//        "dddd",
//        Platforma.PC,
//        description);
//
//    dbOperacijos.insert(new Random().nextInt(100)+"", cs.getPlatforma().name());
//
//    dbOperacijos.atvaizduoti();
//
//    System.out.println("Zanru sarasas!");
//    System.out.println("-----------------------------------------------");
//    try {
//      for (String elem: dbOperacijos.getZanrai()){
//        System.out.println(elem);
//      }
//    } catch (SarasasPerpildytasException e) {
//      e.printStackTrace();
//    }



    List<String> listas = new ArrayList<>();

    Reitingas<Integer> r = new Reitingas<>();
    r.priskirtiReitinga(10);
    r.gautiReitinga();
    r.skaiciuoti(322.3);




    Class newClass = Reitingas.class;

    for (Annotation annotation : newClass.getDeclaredAnnotations()) {
      System.out.println(annotation.toString());
    }


    Score score = new Score();
    score.getKda();


//    Class types = Reitingas.class;
//
//      if (types.isAnnotationPresent(Developer.class)){
//        Annotation anotacija = types.getAnnotation(Developer.class);
//        System.out.println(anotacija.name() +" "+ anotacija.id());
//      }
   // }

    DBOperacijos db;
  }
}
