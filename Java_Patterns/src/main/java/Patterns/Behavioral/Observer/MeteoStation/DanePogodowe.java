package Patterns.Behavioral.Observer.MeteoStation;

import java.util.ArrayList;
/*
Obiekt DanePogodowe jest obiektem obserwowanym.
Obiekt obserwowany zawsze musi posiadac zaimplementowany interfejs Podmiot,
Posiada nadpisane metody do rejestrowania i usuwania obserwatora oraz do powiadomienia obserwatorów kiedy zmieni się status.
 */
public class DanePogodowe implements Podmiot {
  private ArrayList obserwatorzy;
  private float temperatura;
  private float wilgotnosc;
  private float cisnienie;

  public DanePogodowe() {
    obserwatorzy = new ArrayList();
  }

  @Override
  public void zarejestrujObserwatora(Obserwator o) {
    obserwatorzy.add(o);
  }
  @Override
  public void usunObserwatora(Obserwator o) {
    int i = obserwatorzy.indexOf(o);
    if (i >= 0) {
      obserwatorzy.remove(i);
    }
  }
  @Override
  public void powiadomObserwatorow() {
    for (Object Obs: obserwatorzy) {
      Obserwator obserwator = (Obserwator)Obs;
      obserwator.aktualizacja(temperatura, wilgotnosc, cisnienie);
    }
  }
  public void odczytyZmiana(){
    powiadomObserwatorow();
  }

  public void ustawOdczyty(float temperatura, float wilgotnosc, float cisnienie){
    this.temperatura=temperatura;
    this.wilgotnosc=wilgotnosc;
    this.cisnienie=cisnienie;
    odczytyZmiana();
  }
}
