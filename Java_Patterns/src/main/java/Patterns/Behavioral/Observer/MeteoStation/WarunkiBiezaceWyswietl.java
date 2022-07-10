package Patterns.Behavioral.Observer.MeteoStation;
/*
Obiekt WarunkiBiezaceWyswietl jest obiektem obserwującym obiekt DanePogodowe.
Musi posiadać zaimplementowany interfejs Obserwator.
Każdy obiekt obserwujący musi się zarejestrować u danego obiektu obserwowanego aby móc otrzymywać aktualizację.
 */
public class WarunkiBiezaceWyswietl implements Obserwator,WyswietlElement{
  private float temperatura;
  private float wilgotnosc;
  private float cisnienie;
  private Podmiot DanePogodowe;

  // Tutaj następuje rejestrowanie Obiektu obserwującego WarunkiBiezaceWyswietl do obiektu obserwowanego Podmiot
  public WarunkiBiezaceWyswietl(Podmiot DanePogodowe){
    this.DanePogodowe = DanePogodowe;
    DanePogodowe.zarejestrujObserwatora(this);
  }

  @Override
  public void aktualizacja(float temp, float wilgotnosc, float cisnienie) {
  this.temperatura=temp;
  this.wilgotnosc=wilgotnosc;
  this.cisnienie=cisnienie;
  wyswietl();
  }

  @Override
  public void wyswietl() {
    System.out.println("Warunki bieżące " + temperatura +" stopni C , " + wilgotnosc + "% wilgotność, " + cisnienie + "Pa");
  }
}
