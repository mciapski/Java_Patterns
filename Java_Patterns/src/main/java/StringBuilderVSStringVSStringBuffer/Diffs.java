package StringBuilderVSStringVSStringBuffer;

public class Diffs {
  public static void main(String[] args) {


    /**
     * Klasa niemutowalna
     * Jak zmieniamy na inny to tak naprawdę robimy nowy
     * czyli
     * String napis1="aaa" - to 1 String
     * potem
     * napis1= "BBB" - to kolejny String
     * !! to że przypisaliśmy nową wartość to nie oznacza że stara zniknie z pamięci
     * String ma własny obszar pamięci String Pool
     * tego obszaru nie dotyczy czyszczenie pamięci za pomocą Garbage Collectora
     *
     */
    String napis1 = "aaa";
    napis1 = "BBB";

    /**
     * Builder i Buffer są oparte na wzorcu Builder
     * String Buffer był wcześniej, od początku Javy 1.0
     * String Builder powstał wcześniej
     *
     * String Builder jest szybszy ale nie zapewnia bezpieczeństwa w aplikaacjach wielowątkowych
     * StringBuffer jest wolniejszy bo zapewnia bezpieczeństwo w wielowątkowości
     */
    StringBuilder napis2;
    StringBuffer napis3;
  }
}