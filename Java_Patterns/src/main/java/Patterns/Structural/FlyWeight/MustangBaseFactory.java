package Patterns.Structural.FlyWeight;

import java.util.HashSet;
import java.util.Set;

public class MustangBaseFactory {
  //zestaw niepowtarzalnych kombinacji kolor-silnik
  private static Set<FordMustangBase> fordMustangBaseSet = new HashSet<>();

  //fabryka
  public static FordMustangBase getMustangBase(String color, String engine) {
    FordMustangBase fordMustangBase;
    System.out.println(FordMustangBase.class + "getMustangBase");
    if (fordMustangBaseSet.size() > 0) {
      System.out.println("Ilość elementów w secie: " + fordMustangBaseSet.size());

      /**
       * Teraz:
       * - jeśli w secie jest kombinacja kolor-silnik na jaką przyszło zamówienie to ją zwrócimy
       * - jeśli takiej kombinacji nie ma to tworzymy nowy obiekt
       */

      fordMustangBase = fordMustangBaseSet.stream().filter(f -> color.equals(f.getColor()) && engine.equals(f.getEngine()))
          .peek(f -> System.out.println("Znalazłem wymagany Base: " + color + " " + engine))
          .findAny()
          .orElseGet(() -> new FordMustangBase(color, engine));

    } else {
      System.out.println("W fordMustangBaseSet nic jeszcze nie ma! Dodajemy pierwszy element");
      fordMustangBase = new FordMustangBase(color, engine);
    }
    fordMustangBaseSet.add(fordMustangBase);
    return fordMustangBase;
  }

  public static Set<FordMustangBase> getFordMustangBaseSet() {
    return fordMustangBaseSet;
  }
}