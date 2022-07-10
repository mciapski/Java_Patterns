package Patterns.Behavioral.Observer.MeteoStation;

/*
Wszystkie obiekty będące obserwatorami muszą implementować interfejs Obserwator.
Ten interfejs posiada tylko jedną metodę aktualizacja, która jest wywoływana kiedy obiekt obserwowany zmieni swój stan.
 */
public interface Obserwator {

  public void aktualizacja(float temp, float wilgotnosc, float cisnienie);
}
