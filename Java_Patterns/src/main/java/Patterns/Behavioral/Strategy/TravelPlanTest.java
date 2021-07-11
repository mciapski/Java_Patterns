package Patterns.Behavioral.Strategy;

public class TravelPlanTest {
  public static void main(String[] args) {
    TravelDemo travelDemo = new TravelDemo("Rzeszów", "Bieszczady");
    travelDemo.caculateTravelPlan(new WalkStrategy(true));
    travelDemo.getTravelInfo();
    System.out.println("=====================");
    travelDemo.caculateTravelPlan(new CarStrategy(false,true));
    travelDemo.getTravelInfo();
    System.out.println("=====================");
    System.out.println("=====================");
    travelDemo = new TravelDemo("Rzeszów", "Kolonia");
    travelDemo.caculateTravelPlan(new CarStrategy(true,false));
    travelDemo.getTravelInfo();
  }
}
