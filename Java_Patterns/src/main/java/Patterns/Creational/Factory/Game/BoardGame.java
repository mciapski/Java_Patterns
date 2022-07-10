package Patterns.Creational.Factory.Game;

public class BoardGame implements Game {
  private String name;
  private String type;
  private int maxPlayersNum;

  public BoardGame(String name, String type, int maxPlayersNum) {
    this.name = name;
    this.type = type;
    this.maxPlayersNum = maxPlayersNum;
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
    return 2;
  }

  @Override
  public int getMaxNumberOfPlayer() {
    return maxPlayersNum;
  }

  @Override
  public boolean canBePlayedRemotely() {
    return false;
  }

  @Override
  public String toString() {
    return "BoardGame{" +
        "name='" + name + '\'' +
        ", type='" + type + '\'' +
        ", maxPlayersNum=" + maxPlayersNum +
        '}';
  }
}
