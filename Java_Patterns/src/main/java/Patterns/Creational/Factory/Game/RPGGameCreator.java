package Patterns.Creational.Factory.Game;

public class RPGGameCreator implements GameFactory{
  @Override
  public Game create() {
    return new PCGame("Valorant", "FPS", 4, 10, true);
  }
}
