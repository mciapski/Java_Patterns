package FlatMap;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public class FlatMapDemo {
  public static void main(String[] args) {
    Pesel pesel1 = new Pesel("12345");
    Pesel pesel2 = new Pesel("33444");
    Pesel pesel3 = new Pesel("67777");
    Pesel pesel4 = new Pesel("89999");
    Pesel pesel5 = new Pesel("24555");
    Pesel pesel6 = new Pesel("23434");
    Pesel pesel7 = new Pesel("09766");

    List<Pesel> peselList = List.of(pesel1,pesel2,pesel3,pesel4,pesel5,pesel6,pesel7);
    Set<Pesel>  peselSet = Set.of(pesel1,pesel2,pesel3);
    /**
     * Drukujemy wszystkie pesele po kolei
     */
    peselSet.stream().
        map(Pesel::getPeselNumer).
        forEach(System.out::println);
    peselSet.stream().
        map(Pesel::getPeselNumer).
        forEach(System.out::println);

    System.out.println("===================");

    List.of(peselList,peselSet).stream()
        .flatMap(Collection::stream)
        .map(Pesel::getPeselNumer)
        .forEach(System.out::println);

  }
}
