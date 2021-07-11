package Patterns.Behavioral.Strategy;

public class WalkStrategy implements TravelStrategy{
  private boolean includeTouristicPaths;

  public WalkStrategy(boolean includeTouristicPaths) {
    this.includeTouristicPaths = includeTouristicPaths;
  }


  @Override
  public String setTravelPlan(String from, String to) {
    return new StringBuilder("TravelDemo by FOOT from")
        .append(from)
        .append(" to ")
        .append(to)
        .append(includeTouristicPaths? "including touristic paths " : "")
        .toString();
  }
}
