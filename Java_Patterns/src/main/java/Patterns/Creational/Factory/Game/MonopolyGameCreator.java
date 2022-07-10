package Patterns.Creational.Factory.Game;

public class MonopolyGameCreator implements GameFactory{

  @Override
  public Game create() {
    return new BoardGame("Monopoly","Family Game", 4);
  }
}
