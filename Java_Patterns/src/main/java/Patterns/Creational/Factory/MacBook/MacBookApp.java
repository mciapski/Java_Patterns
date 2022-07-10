package Patterns.Creational.Factory.MacBook;

import java.util.List;

public class MacBookApp {
  public static void main(String[] args) {
    /**
     *Klasyczne powoływanie obiektów
     *
     * Operator new nie powinien być nadużywany
     * Powinien być schowany tak, żeby nie używał go każdy i zawsze
     * Normalny użytkownik powinien używać metod dedykowanych do tworzenia obiektu
     */
    MacBook air1 = new MacBookAir("8G", "128", 13);
    MacBook pro1 = new MacBookPro("16G", "256", 16);
    /**
     * Fabryka
     * Dostaje zamówienie na macBooka
     * z punktu widzenia zamawiającego nie ma znaczenia czy on dostanie nowy obiekt
     * czy już istniejący, ważne aby go dostać
     */
    try {
      MacBook air2 = MacBookFactory.getMac("Air", "8G", "256", 13);
      MacBook pro2 = MacBookFactory.getMac("Pro", "8G", "256", 13);
      MacBook pro3 = MacBookFactory.getMac("Pro", "16G", "512", 13);
      MacBook pro4 = MacBookFactory.getMac("Pro", "32G", "512", 16);
      List<MacBook> macBookList = List.of(air1, pro1, air2, pro2, pro3, pro4);
      macBookList.forEach(System.out::println);
    } catch (IllegalArgumentException error) {
      System.out.println(error.getMessage());
    }


  }
}