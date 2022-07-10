package Patterns.Behavioral.Observer.MeteoStation;

/*
Interfejs Podmiot. Obiekty wykorzystuja go do rejestrowania się
w charakterze obserwatorów oraz do usunięcia swoich danych z listy obserwatorów.
 */
public interface Podmiot {
  public void zarejestrujObserwatora (Obserwator o);
  public void usunObserwatora (Obserwator o);
  public void powiadomObserwatorow();
}
