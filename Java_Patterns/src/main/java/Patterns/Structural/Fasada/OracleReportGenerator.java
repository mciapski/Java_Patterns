package Patterns.Structural.Fasada;

import java.sql.Connection;

public class OracleReportGenerator {
  public static Connection getORACLEConnection(){
    //tu powinna być definicja połączenia z MYSQL
    System.out.println("łączymy sie z bazą MySQL");
    return null;
  }

  public OracleReportGenerator(){
    System.out.println(" Tworzymy obiekt generatora raportów");
  }
  public void generateORACLEPDFReport(String table, Connection conn){
    System.out.println("Drukujemy raport PDF z tabeli" + table + "z bazy ORACLE");
  }
  public void generateORACLEHTMLReport(String table, Connection conn){
    System.out.println("Drukujemy raport HTML z tabeli" + table + "z bazy ORACLE");
  }

}
