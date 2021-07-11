package Patterns.Creational.Singletons;

/**
 * Lazy bo nie inicjujemy obiektu od razu, czekamy na pierwsze "wołanie" o niego
 * To powoduje, że LazySingleton nie powinien być stosowany w aplikacjach
 * wielowątkowych bo 2 wątko równocześnie mogłyby wywołać getInstance i stworzyc 2 obiekty klasy
 */
public class LazySingleton {
  private static LazySingleton INSTANCE;

  /**
   * Mamy znowu prywatne pole statyczne, tym razem nie jest inicjowane od razu



   *
   * Prywatny konstruktor, z zwenątrz nie ma dostępu
   */
  private LazySingleton(){
    System.out.println("Lazy Singleton initialisation");
  }

  /**
   * Mamy publiczną statyczną metodę zwracającą obiekt naszej klasy
   * Jeżeli obiekt nie był dotychczas zainicjowany to przy pierwszym wykonaniu metody getInstance się to wykona
   *
   */
  public static LazySingleton getInstance() {
    System.out.println("Lazy Singleton GetInstance");
    if(INSTANCE==null){
      INSTANCE = new LazySingleton();
    }
    return INSTANCE;
  }
}
