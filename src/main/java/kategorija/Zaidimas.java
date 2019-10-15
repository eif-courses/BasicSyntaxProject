package kategorija;

import java.util.List;

public class Zaidimas {
  private String zanras;
  private Platforma platforma;
  private List<String> papildoma_informacija;

  public Zaidimas(String zanras, Platforma platforma, List<String> papildoma_informacija) {
    this.zanras = zanras;
    this.platforma = platforma;
    this.papildoma_informacija = papildoma_informacija;
  }

  /**
   * @see {@link java.util.Scanner}
   * @return zanras tai zaidimo zanras
   */
  public String getZanras() {
    return zanras;
  }

  /**
   *
   * @param zanras jeigu rpg zaidimas bus greitai atsibostantis
   */
  public void setZanras(String zanras) {
    this.zanras = zanras;
  }

  /**
   * <h1>Gausite Zaidimo Platforma</h1>
   * @return platforma
   */
  public Platforma getPlatforma() {
    return platforma;
  }

  /**
   * @deprecated sitas metodas atgyvenes ir bus pakeistas i
   * @param platforma
   */
  @Deprecated
  public void setPlatforma(Platforma platforma) {
    this.platforma = platforma;
  }

  public List<String> getPapildoma_informacija() {
    return papildoma_informacija;
  }

  public void setPapildoma_informacija(List<String> papildoma_informacija) {
    this.papildoma_informacija = papildoma_informacija;
  }
}
