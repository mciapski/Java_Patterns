package Patterns.Creational.Builder;

import java.util.List;

public class BuilderDemo {
  public static void main(String[] args) {

    House smallHouse = new House.HouseBuilder("bloczki","Ytong","Blacha").build();
    House houseWithGarage = new House.HouseBuilder("wylewany","max","Dachówka").
        withGarage("W bryle budynku").
        build();
    House houseWithGarden = new House.HouseBuilder("bloczki","cegła","Papadachówka")
        .withGarden("Ogród z oczkiem")
        .build();
    House residence = new House.HouseBuilder("bloczki","Max","Dachówka")
        .withGarage("2 stanowiska")
        .withGarden("Z oczkiem i żywopłotem")
        .build();

    List<House> listOfHouses = List.of(smallHouse,houseWithGarage,houseWithGarden,residence);
    System.out.println("Podsumowanie 1 sposób wyświetlenia");
    listOfHouses.forEach(x->System.out.println(x.getHouseInfo()));
    System.out.println("");
    System.out.println("Podsumowanie 2 sposób wyświetlenia");
    listOfHouses.stream().map(House::getHouseInfo).forEach(System.out::println);
  }
}
