package Patterns.Structural.Fasada;

import java.sql.Connection;

public class ReportGeneratorFasada {
  public static void generateReport(DBType dbType, ReportType reportType, String table) {
    Connection conn;
    switch (dbType) {
      case MYSQL:
        conn = MySQLReportGenerator.getMySQLConnection();
        MySQLReportGenerator reportGenerator = new MySQLReportGenerator();
        switch (reportType) {
          case HTML:
            reportGenerator.generateMySQLHTMLReport(table, conn);
          case PDF:
            reportGenerator.generateMySQLPDFReport(table, conn);
            break;
        }
      case ORACLE:
        conn = MySQLReportGenerator.getMySQLConnection();
        OracleReportGenerator reportGenerator1 = new OracleReportGenerator();
        switch (reportType) {
          case HTML:
            reportGenerator1.generateORACLEHTMLReport(table, conn);
          case PDF:
            reportGenerator1.generateORACLEPDFReport(table, conn);
            break;
        }
    }
  }

  public enum DBType {
    MYSQL, ORACLE
  }

  public enum ReportType {
    HTML, PDF
  }
}
