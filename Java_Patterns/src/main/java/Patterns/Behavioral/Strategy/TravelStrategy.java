package Patterns.Behavioral.Strategy;

@FunctionalInterface
public interface TravelStrategy {
  String setTravelPlan(String from, String to);
}
