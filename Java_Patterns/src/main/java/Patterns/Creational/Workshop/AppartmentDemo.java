package Patterns.Creational.Workshop;

import Patterns.Creational.Workshop.Models.FamilyHouse;

public class AppartmentDemo {
  public static void main(String[] args) {
    /**
     * BUILDER
     * Tworzenie obiektu za pomocą Builder
     */
    Appartment appartment = new Appartment.AppartmentBuilder()
        .setAddress("Gliwice ul.Jakaś")
        .setFloorsNumber(2)
        .setDoorsNumber(2)
        .setWindowsNumber(5)
        .build();
    appartment.getInformation();
    /**
     * FACTORY
     // from, of, valueOf, instanceOf
     */

    FamilyHouse familyHouse = FamilyHouse.from(appartment);
    System.out.println(familyHouse);

  }
}
