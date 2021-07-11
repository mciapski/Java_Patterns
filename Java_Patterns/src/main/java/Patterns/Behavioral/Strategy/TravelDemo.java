package Patterns.Behavioral.Strategy;

public class TravelDemo {
  private String startAt;
  private String destination;
  private String travelPlan;


  public TravelDemo(String startAt, String destination) {
    this.startAt = startAt;
    this.destination = destination;

  }

  public void caculateTravelPlan(TravelStrategy strategy) {
    travelPlan = strategy.setTravelPlan(startAt, destination);
  }
  public void getTravelInfo(){
    System.out.println("Travelling from " + startAt + " to" + destination);
    System.out.println("=====DETAILS======");
    System.out.println(travelPlan);
    System.out.println("==================");
  }
}
