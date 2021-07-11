package Patterns.Structural.Fasada;

import java.sql.Connection;

public class Demo {
  public static void main(String[] args) {
    String table = "Employee";

    //generujemy raport z tabeli z bazy Oracle
    Connection connection = OracleReportGenerator.getORACLEConnection();
    OracleReportGenerator oracleReportGenerator = new OracleReportGenerator();
    // PDF i HTML z ORACLE
    oracleReportGenerator.generateORACLEPDFReport(table, connection);
    oracleReportGenerator.generateORACLEHTMLReport(table, connection);

    //generujemy raport z tabeli z bazy MySQL
    Connection connection1 = MySQLReportGenerator.getMySQLConnection();
    MySQLReportGenerator mySQLReportGenerator = new MySQLReportGenerator();
    mySQLReportGenerator.generateMySQLPDFReport(table, connection1);
    mySQLReportGenerator.generateMySQLHTMLReport(table, connection1);
    /**
     * Problem: klient (aplikacja która używa generatora raportów)
     * musi wykonać kilka kroków zanim dostanie to o co naprawdę chodzi
     */

    ReportGeneratorFasada.generateReport(ReportGeneratorFasada.DBType.ORACLE,
        ReportGeneratorFasada.ReportType.PDF,
        table);
    ReportGeneratorFasada.generateReport(ReportGeneratorFasada.DBType.ORACLE,
        ReportGeneratorFasada.ReportType.HTML,
        table);
    ReportGeneratorFasada.generateReport(ReportGeneratorFasada.DBType.MYSQL,
        ReportGeneratorFasada.ReportType.PDF,
        table);
    ReportGeneratorFasada.generateReport(ReportGeneratorFasada.DBType.MYSQL,
        ReportGeneratorFasada.ReportType.HTML,
        table);
  }

}
