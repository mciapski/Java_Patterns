package Patterns.Creational.Singletons;

public class Demo {
  public static void main(String[] args) {
    EagerSingleton eager1 = EagerSingleton.getInstance();
    EagerSingleton eager2 = EagerSingleton.getInstance();
    eager1.setSomeSettings("Cos ustawiamy");
    System.out.println(eager2.getSomeSettings());
    System.out.println("========================");
    System.out.println("========================");
    LazySingleton lazySingleton = LazySingleton.getInstance();

  }
}
