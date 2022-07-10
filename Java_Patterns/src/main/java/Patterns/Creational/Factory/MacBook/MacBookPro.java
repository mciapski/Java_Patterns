package Patterns.Creational.Factory.MacBook;

class MacBookPro extends MacBook{
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
    return this.memory;
  }

  @Override
  public String getDisc() {
    return this.disc;
  }

  @Override
  public int getScreenSize() {
    return this.screenSize;
  }
}
