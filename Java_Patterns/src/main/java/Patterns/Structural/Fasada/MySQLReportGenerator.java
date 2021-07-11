package Patterns.Structural.Fasada;

import Patterns.Structural.Proxy.CompanyInternetNetwork;

import java.sql.Connection;

public class MySQLReportGenerator {
  public static Connection getMySQLConnection(){
    //tu powinna być definicja połączenia z MYSQL
    System.out.println("łączymy sie z bazą MySQL");
    return null;
  }

  public MySQLReportGenerator(){
    System.out.println(" Tworzymy obiekt generatora raportów");
  }
  public void generateMySQLPDFReport(String table, Connection conn){
    System.out.println("Drukujemy raport PDF z tabeli" + table + "z bazy MySQL");
  }
  public void generateMySQLHTMLReport(String table, Connection conn){
    System.out.println("Drukujemy raport HTML z tabeli" + table + "z bazy MySQL");
  }

}
