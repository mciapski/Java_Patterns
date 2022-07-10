package Patterns.Creational.Factory.Game;

public interface Game {
  String getName();
  String getType();
  int getMinNumberOfPlayer();
  int getMaxNumberOfPlayer();
  boolean canBePlayedRemotely();

}
