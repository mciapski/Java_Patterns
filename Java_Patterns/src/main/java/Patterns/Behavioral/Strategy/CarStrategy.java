package Patterns.Behavioral.Strategy;

public class CarStrategy implements TravelStrategy{
  private boolean includePaidMotorways;
  private boolean includeFieldRoads;

  public CarStrategy(boolean includePaidMotorways, boolean includeFieldRoads) {
    this.includePaidMotorways = includePaidMotorways;
    this.includeFieldRoads = includeFieldRoads;
  }

  @Override
  public String setTravelPlan(String from, String to) {
    return new StringBuilder(" TravelDemo by CAR from ")
        .append(from)
        .append(" to ")
        .append(to)
        .append(includePaidMotorways? " including oaid Motorways" : "")
        .append(includeFieldRoads ? " including field roads " : "")
        .toString();
  }
}
