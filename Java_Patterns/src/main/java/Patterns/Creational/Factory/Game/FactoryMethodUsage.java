package Patterns.Creational.Factory.Game;

import java.util.Scanner;

/**
 * Program w oparciu o wzorzec Factory tworzy gry.
 * W zależności od podanego typu "PC" lub "Board" program stworzy:
 * ("Valorant", "FPS", 4, 10, true) lub ("Monopoly","Family Game", 4)
 * 1. Klasa PCGame implementuje interfejs Game.
 * 2. Klasa BoardGame implementuje interfejs Game.
 * 3. W interfejsie Game znajdują się metody takie jak:
 *   String getName();
 *   String getType();
 *   int getMinNumberOfPlayer();
 *   int getMaxNumberOfPlayer();
 *   boolean canBePlayedRemotely();
 * 4. Klasa PCGame zawiera pola takie jak:
 *   private final String name;
 *   private final String type;
 *   private final int minNumberOfPlayers;
 *   private final int maxNumberOfPlayers;
 *   private final boolean isOnline;
 * 5. Klasa BoardGame zawiera pola takie jak:
 *   private String name;
 *   private String type;
 *   private int maxPlayersNum;
 * 6. Interfejs GameFactory posiada metodę create();
 * 7. Klasa MonopolyGameCreator implementuje GameFactory i przesłaniając metodę create() tworzy nowy obiekt typu BoardGame,
 * 8. Klasa RPGGameCreator implementuje GameFactory i przesłaniając metodę create() tworzy nowy obiekt typu PCGame,
 * 9. W klasie main (FactoryMethodUsage) pobrany zostaje od użytkownika typ : PC lub Board i w zależności od tego stworzony zostaje obiekt
 *   klasy RPGGameCreator lub MonopolyGameCreator. Jeżeli wartość wpisana przez użytkownika będzie inna niż wymagane, wyrzucony zostanie wyjątek
 *   IllegalArgumentException
 */


public class FactoryMethodUsage {
  public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj typ gry: PC lub Board");
    String typePcOrBoard = scanner.nextLine();

    Game createdGame = creator(typePcOrBoard).create();

    System.out.println("Created game: " + createdGame);
  }
  public static GameFactory creator(String choice){
    GameFactory gameFactory;
    if (choice.equalsIgnoreCase("PC")) {
      gameFactory = new RPGGameCreator();
    } else if (choice.equalsIgnoreCase("Board")) {
      gameFactory = new MonopolyGameCreator();
    } else {
      throw new IllegalArgumentException("Unknown game type");
    }
    return gameFactory;
  }
}