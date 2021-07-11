package Patterns.Structural.Proxy;

public class ProxyDemo {
  public static void main(String[] args) {

    CompanyEmployees companyEmployees = new CompanyEmployees();
    companyEmployees.addEmployee("Jan Kowalski");
    companyEmployees.addEmployee("Zofia Nowak");
    companyEmployees.addEmployee("Piotr Bysiewicz");

    CompanyInternetNetwork internetNetwork = new ProxyCompanyInternetNetwork();
    internetNetwork.getAccess("Jan Kowalski");
    internetNetwork.getAccess("Zofia Nowak");
    internetNetwork.getAccess("Piotr Nowak");
  }
}
