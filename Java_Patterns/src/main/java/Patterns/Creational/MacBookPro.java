package Patterns.Creational;

public class MacBookPro extends MacBook{
  private String memory;
  private String disc;
  private int screenSize;

  public MacBookPro(String memory, String disc, int screenSize) {
    this.memory = memory;
    this.disc = disc;
    this.screenSize = screenSize;
  }

  @Override
  public String getMemory() {
    return null;
  }

  @Override
  public String getDisc() {
    return null;
  }

  @Override
  public int getScreenSize() {
    return 0;
  }
}
