package Patterns.Structural.Proxy;

public class PublicCompanyInternetNetwork implements CompanyInternetNetwork{
  private  String username;

  public PublicCompanyInternetNetwork(String username) {
    this.username = username;
  }

  @Override
  public void getAccess(String username) {
    System.out.println("Granted PUBLIC access to company network, no internal stuff available"+ username);
  }
}
