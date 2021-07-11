package Patterns.Creational.Singletons;

/**
 * 1. Mamy prywatne statyczne pole będące obiektem naszej klasy
 * - prywatne więc nie ma do niego dostępu z zewnątrz (a w każdym razie nie tak łatwo)
 * - statyczne więc jeden obiekt wspólny dla klasy
 * - Eager czyli "od razu", w naszym przykładznie oznacza to to że obiekt INSTANCE jest tworzony od razu w momencie kompilacji
 */
public class EagerSingleton {
  private static final EagerSingleton INSTANCE = new EagerSingleton();
private String someSettings;
  /**
   * Prywatny konstruktor, więc nie wywołamy go z zewnątrz (a w każdym razie nie tak łatwo)
   */
  private EagerSingleton(){
    System.out.println("Eager singleton initialisation");
  }

  /**
   * publiczna statyczna metoda zwracająca istniejący obiekt
   */
  public static EagerSingleton getInstance(){
    System.out.println("Method getInstance");
    return INSTANCE;
  }
  public String getSomeSettings(){
    return someSettings;
  }

  public void setSomeSettings(String someSettings) {
    this.someSettings = someSettings;
  }
}
