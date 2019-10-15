package generics;

import anotacijos.Developer;

import java.util.List;

@Developer(name = "Marius", id=89988)
public class Reitingas <LABAS> {
  //Object o;
  LABAS labas; // INT
  public void priskirtiReitinga(LABAS l){
    this.labas = l;
  }
  public LABAS gautiReitinga(){
    return labas;
  }

  public <KITAS> KITAS skaiciuoti(KITAS kitas){
    System.out.println(kitas.getClass().getSimpleName());
    return kitas;
  }

}
