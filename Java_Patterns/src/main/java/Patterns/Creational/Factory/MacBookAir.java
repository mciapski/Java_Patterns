package Patterns.Creational.Factory;

class MacBookAir extends MacBook {
  private String memory;
  private String disc;
  private int screenSize;

  public MacBookAir(String memory, String disc, int screenSize) {
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
