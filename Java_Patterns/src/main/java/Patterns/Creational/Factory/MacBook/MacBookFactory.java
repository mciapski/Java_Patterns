package Patterns.Creational.Factory.MacBook;

public class MacBookFactory {

  public static MacBook getMac(String type, String memory, String disc, int screenSize) {
    if ("Air".equalsIgnoreCase(type)) {
      return new MacBookAir(memory, disc, screenSize);
    } else if ("Pro".equalsIgnoreCase(type)) {
      return new MacBookPro(memory, disc, screenSize);
    }
    throw new IllegalArgumentException("Wrong type:" + type);
  }
}
