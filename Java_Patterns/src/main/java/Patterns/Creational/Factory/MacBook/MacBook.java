package Patterns.Creational.Factory.MacBook;

abstract class MacBook {
  public abstract String getMemory();

  public abstract String getDisc();

  public abstract int getScreenSize();

  @Override
  public String toString() {
    return "MacBook{" + getMemory() +
        "disc" + getDisc() +
        "ScreenSize" + getScreenSize() +
        "}";
  }
}
