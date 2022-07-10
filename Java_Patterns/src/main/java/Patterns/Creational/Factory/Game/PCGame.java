package Patterns.Creational.Factory.Game;

public class PCGame implements Game{
  private final String name;
  private final String type;
  private final int minNumberOfPlayers;
  private final int maxNumberOfPlayers;
  private final boolean isOnline;

  public PCGame(String name, String type, int minNumberOfPlayers, int maxNumberOfPlayers, boolean isOnline) {
    this.name = name;
    this.type = type;
    this.minNumberOfPlayers = minNumberOfPlayers;
    this.maxNumberOfPlayers = maxNumberOfPlayers;
    this.isOnline = isOnline;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String getType() {
    return type;
  }

  @Override
  public int getMinNumberOfPlayer() {
    return minNumberOfPlayers;
  }

  @Override
  public int getMaxNumberOfPlayer() {
    return maxNumberOfPlayers;
  }

  @Override
  public boolean canBePlayedRemotely() {
    return isOnline;
  }

  @Override
  public String toString() {
    return "PCGame{" +
        "name='" + name + '\'' +
        ", type='" + type + '\'' +
        ", minNumberOfPlayers=" + minNumberOfPlayers +
        ", maxNumberOfPlayers=" + maxNumberOfPlayers +
        ", isOnline=" + isOnline +
        '}';
  }
}
