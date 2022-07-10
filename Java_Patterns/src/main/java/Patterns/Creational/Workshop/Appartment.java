package Patterns.Creational.Workshop;

public class Appartment {
  private String address;
  private Integer floorsNumber;
  private Integer doorsNumber;
  private Integer windowsNumber;

  public Appartment() {
  }

  /**
   * 1. Private zabezpiecza przed wywołaniem konstruktora z zewnątrz
   * 2. Przyjmując jako argument konstruktora obiekt klasy Builder (ApartmentBuilder) mamy możliwość
   * przypisania polą klasy Appartment wartości pól Buildera (ApartmentBuilder)
   * 3. Dzięi temu w metodzie build() tworzenie obiektu klasy Appartment odbywa się za pośrednictwem "this"
   *
   * public Appartment build() {
   *       return new Appartment(this);
   *     }
   *
   */
  private Appartment(AppartmentBuilder appartmentBuilder) {
    this.address=appartmentBuilder.address;
    this.floorsNumber=appartmentBuilder.floorsNumber;
    this.doorsNumber=appartmentBuilder.doorsNumber;
    this.windowsNumber=appartmentBuilder.windowsNumber;
  }
  /**
  Pobieranie i wyświetlanie informacji
   */
  public String getInformation(){
    StringBuilder sb = new StringBuilder();
    String getinformation = sb.append("Address: " + address).append("\n")
        .append("Floors number: " + floorsNumber).append("\n")
        .append("Doors number: " + doorsNumber).append("\n")
        .append("Windows number: " + windowsNumber).toString();
    System.out.println(getinformation);
    return getinformation;
  }

  /**
   * 1. Klasa statyczna ma dostęp do konstruktora prywatnego
   * 2. Builder jako statyczna klasa wewnętrzna
    */

  public static class AppartmentBuilder {
    private String address;
    private Integer floorsNumber;
    private Integer doorsNumber;
    private Integer windowsNumber;

    public AppartmentBuilder setAddress(String address) {
      this.address = address;
      return this;
    }

    public AppartmentBuilder setFloorsNumber(Integer floorsNumber) {
      this.floorsNumber = floorsNumber;
      return this;
    }

    public AppartmentBuilder setDoorsNumber(Integer doorsNumber) {
      this.doorsNumber = doorsNumber;
      return this;
    }

    public AppartmentBuilder setWindowsNumber(Integer windowsNumber) {
      this.windowsNumber = windowsNumber;
      return this;
    }



    public Appartment build() {
      return new Appartment(this);
    }
  }
  /**
   * Gettery
   *
   */
  public String getAddress() {
    return address;
  }

  public Integer getFloorsNumber() {
    return floorsNumber;
  }

  public Integer getDoorsNumber() {
    return doorsNumber;
  }

  public Integer getWindowsNumber() {
    return windowsNumber;
  }
}
