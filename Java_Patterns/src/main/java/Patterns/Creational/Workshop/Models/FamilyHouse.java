package Patterns.Creational.Workshop.Models;

import Patterns.Creational.Builder.House;
import Patterns.Creational.Workshop.Appartment;

public class FamilyHouse {
  String adress;
  Integer floorsNumber;

  public FamilyHouse(String address, Integer floorsNumber) {
    this.adress=address;
    this.floorsNumber=floorsNumber;
  }

  public static FamilyHouse from(Appartment appartment){
    return new FamilyHouse(appartment.getAddress(),appartment.getFloorsNumber());

  }

  @Override
  public String toString() {
    return "FamilyHouse{" +
        "adress='" + adress + '\'' +
        ", floorsNumber=" + floorsNumber +
        '}';
  }
}
