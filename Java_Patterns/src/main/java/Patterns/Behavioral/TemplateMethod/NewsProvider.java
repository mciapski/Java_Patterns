package Patterns.Behavioral.TemplateMethod;

public abstract class NewsProvider {
  private String message;

  public NewsProvider(String message) {
    this.message = message;
  }

  // metoda która musimy nadpisać
  public abstract boolean authorize();

  //metoda która pozostaje niezmienna
  public final boolean sendMessage() {
    System.out.println("Message sent: " + message);
    return true;
  }

  // metoda opcjonalnie do nadpisania, zależnie od ustawienia kanału komunikacji
  public boolean endConnection() {
    System.out.println(" Generic end connection");
    return true;
  }

  // metoda przechowująca algorytm, nie można jej nadpisać
  public final void provideNews() {
    if (authorize()) {
      sendMessage();
      endConnection();
    } else {
      System.out.println("Cant' send to unauthorized");
    }
  }
}