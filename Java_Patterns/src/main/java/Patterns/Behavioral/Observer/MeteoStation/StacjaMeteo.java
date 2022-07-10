package Patterns.Behavioral.Observer.MeteoStation;

public class StacjaMeteo {
  public static void main(String[] args) {
    DanePogodowe danePogodowe = new DanePogodowe();

    WarunkiBiezaceWyswietl warunkiBiezaceWyswietl = new WarunkiBiezaceWyswietl(danePogodowe);
    danePogodowe.ustawOdczyty(26.6f, 65, 1013.1f);
  }
}
